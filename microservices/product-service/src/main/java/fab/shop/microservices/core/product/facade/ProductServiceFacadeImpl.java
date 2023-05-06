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
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.core.product.transfer.OfferPurchase;
import fab.shop.api.core.product.msg.ProductConfirmRQ;
import fab.shop.api.core.product.msg.ProductConfirmRS;
import fab.shop.api.exceptions.ProductPurchaseConfirmAvailabilityException;
import fab.shop.api.exceptions.ProductPurchaseConfirmBookingException;
import fab.shop.api.exceptions.ProductPurchaseConfirmException;
import fab.shop.api.exceptions.ProductPurchaseConfirmReduceStockException;
import fab.shop.microservices.core.product.helper.IProductAvailabilityHelper;
import fab.shop.microservices.core.product.helper.IProductPurchaseHelper;

import org.springframework.transaction.annotation.Transactional;



@Component
public class ProductServiceFacadeImpl implements IProductServiceFacade{

    @Autowired
    private IProductPurchaseHelper productPurchaseHelper;

    @Autowired
    private IProductAvailabilityHelper productAvailabilityHelper;


    public IProductPurchaseHelper getProductPurchaseHelper() {
        return this.productPurchaseHelper;
    }

    public void setProductPurchaseHelper(IProductPurchaseHelper productPurchaseHelper) {
        this.productPurchaseHelper = productPurchaseHelper;
    }


    public IProductAvailabilityHelper getProductAvailabilityHelper() {
        return this.productAvailabilityHelper;
    }

    public void setProductAvailabilityHelper(IProductAvailabilityHelper productAvailabilityHelper) {
        this.productAvailabilityHelper = productAvailabilityHelper;
    }



    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        return getProductAvailabilityHelper().getAvail(getAvailRQ);
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        return getProductAvailabilityHelper().getOfferListDetail(getOfferListDetailRQ);
    }

    @Override
    public ProductConfirmRS productConfirm(ProductConfirmRQ productPurchaseConfirmRQ){  
        ProductConfirmRS rs = new ProductConfirmRS();
        try {
            rs = getProductPurchaseHelper().bookPurchaseList(productPurchaseConfirmRQ);
        } catch (ProductPurchaseConfirmException e) {
            rs = e.getProductPurchaseConfirmRS();
        } catch(Throwable t){
            String sError = "ERROR - purchase not confirmed - msg: " + t.getMessage();
            rs.addError(sError);
            rs.setBConfirmed(false);
        }
        return rs;
    }

    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'productPurchaseConfirm'");
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
