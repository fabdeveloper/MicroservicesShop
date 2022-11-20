package fab.shop.microservices.core.product.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.ProductService;
import fab.shop.api.core.product.msg.GenericProductConfigRQ;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.OfferAvail;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelperImpl;
import fab.shop.microservices.core.product.persistence.OfferEntity;



@RestController
public class ProductServiceImpl implements ProductService{

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ServiceUtil serviceUtil;

    private final ProductConfigPersistenceHelperImpl persistenceHelper;

    private final ProductServiceGeneralMapper mapper;


    @Autowired
  public ProductServiceImpl(ServiceUtil serviceUtil, ProductConfigPersistenceHelperImpl persistenceHelper, ProductServiceGeneralMapper mapper) {
    this.serviceUtil = serviceUtil;
    this.persistenceHelper = persistenceHelper;
    this.mapper = mapper;
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
      GetAvailRS rs = new GetAvailRS();
      String msg = "ProductServiceImpl - getAvail() - recibido rq = " + getAvailRQ.toString();

      Integer offerCount = getAvailRQ.getOfferList().size();
      Integer articleCount = getAvailRQ.getArticleList().size();
      Integer productCount = getAvailRQ.getProductList().size();


      if(getAvailRQ.getShopId() == null){
        msg += "-------------------------------------->  " + "   ERROR : shopId is null";
        rs.setStatus(msg);
        return rs;
      }

      for(Integer offerId : getAvailRQ.getOfferList()){
        OfferEntity entity = getPersistenceHelper().getOfferRepository().findById(offerId).get();
        Offer offer = getMapper().getOfferMapper().entityToApi(entity);
        Integer offerAvailCount = 5;
        OfferAvail offerAvail = new OfferAvail(offer, offerAvailCount);
        rs.addOffer(offerAvail);

      }


      


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


    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {

      String msg = "recibido rq = " + productCreateNewRQ.toString();

      ProductCreateNewRS rs = new ProductCreateNewRS();
      rs.addError(msg);


      return rs;
    }


    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {

      
      String msg = "recibido rq = " + testConfigRQ.toString();

      ProductCreateNewRS rs = new ProductCreateNewRS();
      rs.addError(msg);


      return rs;
    }



  public ServiceUtil getServiceUtil() {
    return this.serviceUtil;
  }


  public ProductConfigPersistenceHelperImpl getPersistenceHelper() {
    return this.persistenceHelper;
  }


  public ProductServiceGeneralMapper getMapper() {
    return this.mapper;
  }


    
}
