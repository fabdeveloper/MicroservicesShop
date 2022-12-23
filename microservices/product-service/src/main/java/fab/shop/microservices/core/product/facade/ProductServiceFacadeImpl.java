package fab.shop.microservices.core.product.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.api.core.product.ProductService;
import fab.shop.api.core.product.msg.GenericProductConfigRQ;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.OfferPurchase;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.exceptions.ProductPurchaseConfirmAvailabilityException;
import fab.shop.api.exceptions.ProductPurchaseConfirmBookingException;
import fab.shop.api.exceptions.ProductPurchaseConfirmException;
import fab.shop.api.exceptions.ProductPurchaseConfirmReduceStockException;
import fab.shop.microservices.core.product.helper.IProductPurchaseHelper;

import org.springframework.transaction.annotation.Transactional;



@Component
public class ProductServiceFacadeImpl implements IProductServiceFacade{

    @Autowired
    private IProductPurchaseHelper productPurchaseHelper;


    public IProductPurchaseHelper getProductPurchaseHelper() {
        return this.productPurchaseHelper;
    }

    public void setProductPurchaseHelper(IProductPurchaseHelper productPurchaseHelper) {
        this.productPurchaseHelper = productPurchaseHelper;
    }


    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Transactional
    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) throws ProductPurchaseConfirmException{
        ProductPurchaseConfirmRS rs = new ProductPurchaseConfirmRS();
        rs.addError(productPurchaseConfirmRQ.toString());
        rs.setShopId(productPurchaseConfirmRQ.getShopId());
        rs.setBConfirmed(false);


        String sError;
        ProductPurchaseConfirmException exception;

        List<OfferPurchase> purchaseList = productPurchaseConfirmRQ.getOfferPurchaseList();
        // checkAvailability
        Boolean bAvail = getProductPurchaseHelper().checkAvailability(purchaseList);
        if(!bAvail){
            exception = new ProductPurchaseConfirmAvailabilityException();
            sError = "Availability ERROR: product not available";
            rs.addError(sError);
            exception.setProductPurchaseConfirmRS(rs);
            throw exception;
        }

        // book
        Integer bookingNumber;
        try{
            bookingNumber = getProductPurchaseHelper().bookPurchaseList(purchaseList);
        } catch(ProductPurchaseConfirmBookingException ppcbException){
            sError = "Confirmation ERROR: product list NOT confirmed";
            rs.addError(sError);
            ppcbException.setProductPurchaseConfirmRS(rs);
            throw ppcbException;
        } catch(Throwable t){
            sError = "Confirmation ERROR: product list NOT confirmed";
            rs.addError(sError);
            rs.addError(t.getMessage());
            exception = new ProductPurchaseConfirmBookingException();
            exception.setProductPurchaseConfirmRS(rs);            
            throw exception;
        }        

        // decrementStock
        Boolean bDecrementStock = getProductPurchaseHelper().decrementStock(purchaseList);
        if(!bDecrementStock){
            exception = new ProductPurchaseConfirmReduceStockException();
            sError = "Confirmation ERROR: product list NOT confirmed";
            rs.addError(sError);
            exception.setProductPurchaseConfirmRS(rs);
            throw exception;
        }

        rs.setBConfirmed(true);
        rs.setProductBookingNumber(bookingNumber);

        return rs;
    }

    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
