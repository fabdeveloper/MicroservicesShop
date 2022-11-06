package fab.shop.microservices.core.product.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.ProductService;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.exceptions.InvalidInputException;
import fab.shop.api.exceptions.NotFoundException;


@RestController
public class ProductServiceImpl implements ProductService{

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ServiceUtil serviceUtil;


    @Autowired
    public ProductServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    // @Override
    // public Product getProduct(int productId) {
    //     LOG.debug("/product return the found product for productId={}", productId);

    //     if (productId < 1) {
    //       throw new InvalidInputException("Invalid productId: " + productId);
    //     }
    
    //     if (productId == 13) {
    //       throw new NotFoundException("No product found for productId: " + productId);
    //     }
        
    //     // return product_repository.findById(productId);

        
    //     // int id, String name, String description, String remarks, String type, String serviceAddress

    //     Product prod = new Product(productId, null, null, null, null, null, null);

    //     return new Product(productId, "product" + productId, "fake product", "fake product remarks", "fake product type", serviceUtil.getServiceAddress());
    // }


    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
      String msg = "ProductServiceImpl - getAvail() - recibido rq = " + getAvailRQ.toString();


      GetAvailRS rs = new GetAvailRS();
      rs.setStatus(msg);
      return rs;
    }


    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {

      String msg = "recibido rq = " + getOfferListDetailRQ.toString();


      GetOfferListDetailRS rs = new GetOfferListDetailRS();
      rs.setStatus(msg);


      return rs;
    }


    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {

      String msg = "recibido rq = " + productPurchaseConfirmRQ.toString();


      ProductPurchaseConfirmRS rs = new ProductPurchaseConfirmRS();
      rs.setStatus(msg);


      return rs;

    }


    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {

      
      String msg = "recibido rq = " + productPurchaseCancelRQ.toString();


      ProductPurchaseCancelRS rs = new ProductPurchaseCancelRS();
      rs.setStatus(msg);


      return rs;
    }
    
}
