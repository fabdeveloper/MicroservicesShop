package fab.shop.microservices.core.product.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import fab.shop.api.core.product.ProductService;
import fab.shop.api.core.product.msg.*;
import fab.shop.api.exceptions.ProductPurchaseConfirmException;
import fab.shop.microservices.core.product.facade.IProductServiceFacade;
import fab.shop.microservices.core.product.facade.ProductServiceFacadeImpl;



// import java.util.ArrayList;
// import java.util.List;
// import fab.shop.util.http.ServiceUtil;
// import fab.shop.api.core.product.Article;
// import fab.shop.api.core.product.Offer;
// import fab.shop.api.core.product.Product;

// import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
// import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelperImpl;
// import fab.shop.microservices.core.product.persistence.ArticleEntity;
// import fab.shop.microservices.core.product.persistence.OfferEntity;

// import org.springframework.transaction.annotation.Transactional;




@RestController
public class ProductServiceImpl implements ProductService{

  @Autowired
  private IProductServiceFacade productServiceFacade;


  public IProductServiceFacade getProductServiceFacade() {
    return this.productServiceFacade;
  }

  public void setProductServiceFacade(IProductServiceFacade productServiceFacade) {
    this.productServiceFacade = productServiceFacade;
  }


  @Override
  public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
    GetAvailRS rs = new GetAvailRS();
    rs = getProductServiceFacade().getAvail(getAvailRQ);

    return rs;
  }

  @Override
  public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
    GetOfferListDetailRS rs;
    rs = getProductServiceFacade().getOfferListDetail(getOfferListDetailRQ);

    return rs;
  }

  @Override
  public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
    ProductPurchaseConfirmRS rs = new ProductPurchaseConfirmRS();
    rs = getProductServiceFacade().productPurchaseConfirm(productPurchaseConfirmRQ);

    String msg = "recibido rq = " + productPurchaseConfirmRQ.toString();
    rs.addError(msg);
    return rs;
  }

  @Override
  public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
    ProductPurchaseCancelRS rs;
    rs = getProductServiceFacade().productPurchaseCancel(productPurchaseCancelRQ);

    return rs;
  }

  @Override
  public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
    ProductCreateNewRS rs;
    rs = getProductServiceFacade().productCreateNew(productCreateNewRQ);
    
    return rs;
  }

  @Override
  public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
    // TODO Auto-generated method stub
    return null;
  }









  
  /**************************************************************************************************/

  //     private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

//     private final ServiceUtil serviceUtil;

//     private final ProductConfigPersistenceHelperImpl persistenceHelper;

//     private final ProductServiceGeneralMapper mapper;


//     @Autowired
//   public ProductServiceImpl(ServiceUtil serviceUtil, ProductConfigPersistenceHelperImpl persistenceHelper, ProductServiceGeneralMapper mapper) {
//     this.serviceUtil = serviceUtil;
//     this.persistenceHelper = persistenceHelper;
//     this.mapper = mapper;
//   }



//     // @Override
//     // public Product getProduct(int productId) {
//     //     LOG.debug("/product return the found product for productId={}", productId);

//     //     if (productId < 1) {
//     //       throw new InvalidInputException("Invalid productId: " + productId);
//     //     }
    
//     //     if (productId == 13) {
//     //       throw new NotFoundException("No product found for productId: " + productId);
//     //     }
        
//     //     // return product_repository.findById(productId);

        
//     //     // int id, String name, String description, String remarks, String type, String serviceAddress

//     //     Product prod = new Product(productId, null, null, null, null, null, null);

//     //     return new Product(productId, "product" + productId, "fake product", "fake product remarks", "fake product type", serviceUtil.getServiceAddress());
//     // }


//     // private List getApiObjectListFromParentId(){
//     //   List apiList = null;


//     //   return apiList;
//     // }

//     private List<Article> getArticleListFromProductId(Integer productId){
//       List<Article> articleList = null;
//       List<ArticleEntity> entityList = getPersistenceHelper().getArticleRepository().findByProductId(productId);

//       articleList =  getMapper().getArticleMapper().entityListToApiList(entityList);
//       return articleList;
//     }

//     private List<Offer> getOfferListFromArticleId(Integer articleId){
//       List<Offer> offerList = null;
//       List<OfferEntity> entityList = getPersistenceHelper().getOfferRepository().findByArticleId(articleId);

//       offerList =  getMapper().getOfferMapper().entityListToApiList(entityList);
//       return offerList;
//     }


//     @Transactional
//     @Override
//     public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
//       GetAvailRS rs = new GetAvailRS();
//       String msg = "ProductServiceImpl - getAvail() - recibido rq = " + getAvailRQ.toString();


//       if(getAvailRQ.getShopId() == null){
//         msg += "-------------------------------------->  " + "   ERROR : shopId is null";
//         rs.setStatus(msg);
//         return rs;
//       }

//       List<Article> articleList;   
//       for(Integer productId : getAvailRQ.getProductList()){
//         articleList = getArticleListFromProductId(productId);
//         for(Article article : articleList){
//           rs.addArticle(article);
//         }
//       }

//       List<Offer> offerList;
//       for(Integer articleId : getAvailRQ.getArticleList()){
//         offerList = getOfferListFromArticleId(articleId);
//         for(Offer offer : offerList){
//           rs.addOffer(offer);
//         }
//       }

//       rs.setStatus(msg);
//       return rs;
//     }


//     @Transactional
//     @Override
//     public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
//       GetOfferListDetailRS rs = new GetOfferListDetailRS();

//       String msg = "recibido rq = " + getOfferListDetailRQ.toString();
//       rs.setStatus(msg);

//       Offer offer = null;
//       OfferEntity entity = null;
//       for(Integer offerId : getOfferListDetailRQ.getOfferList()){
//         entity = getPersistenceHelper().getOfferRepository().findById(offerId).get();
//         if(entity !=  null){
//           offer = getMapper().getOfferMapper().entityToApi(entity);
//           rs.addOffer(offer);
//         }
//       }
//       return rs;
//     }

//     private Boolean isStillAvailable(OfferPurchase offerPurchase){
//       Boolean bResult = false;

//       OfferEntity entity = getPersistenceHelper().getOfferRepository().findById(offerPurchase.getOfferId()).get();
//       if(entity != null){
//         Integer nAvail = entity.getAvailCount();
//         bResult = nAvail >= offerPurchase.getCount();
//       }
//       return bResult;
//     }

//     private Boolean reduceStock(OfferPurchase offerPurchase){
//       Boolean bResult = false;

//       OfferEntity entity = getPersistenceHelper().getOfferRepository().findById(offerPurchase.getOfferId()).get();
//       if(entity != null && entity.getAvailCount() >= offerPurchase.getCount()){
//         entity.setAvailCount(entity.getAvailCount() - offerPurchase.getCount());
//         getPersistenceHelper().getOfferRepository().save(entity);
//         bResult = true;        
//       }
//       return bResult;
//     }


//     @Transactional
//     @Override
//     public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
//       ProductPurchaseConfirmRS rs = new ProductPurchaseConfirmRS();

//       rs = 

// /*****************************
//       // check for availability
//       Boolean bAvailable = true;
//       for(OfferPurchase offerPurchase : productPurchaseConfirmRQ.getOfferPurchaseList()){
//         if(!isStillAvailable(offerPurchase)){
//           bAvailable = false;
//           String errorString = "ERROR - offer with ID : " + offerPurchase.getOfferId() + ", not available";
//           rs.addError(errorString);
//         }
//       }
//       if(!bAvailable){
//         rs.setBConfirmed(false);
//         return rs;
//       }
      
//       // reduce stock
//       Boolean bStockReduced = true;
//       for(OfferPurchase offerPurchase : productPurchaseConfirmRQ.getOfferPurchaseList()){
//         if(!reduceStock(offerPurchase)){
//           bStockReduced = false;
//           String errorString = "ERROR - offer with ID : " + offerPurchase.getOfferId() + ", unable to reduce stock";
//           rs.addError(errorString);
//         }
//       }
//       if(!bStockReduced){
        
//       }



//       // create a booking

//        **********************************/
      

//       String msg = "recibido rq = " + productPurchaseConfirmRQ.toString();
//       rs.addError(msg);
//       return rs;

//     }


//     @Override
//     public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {

      
//       String msg = "recibido rq = " + productPurchaseCancelRQ.toString();


//       ProductPurchaseCancelRS rs = new ProductPurchaseCancelRS();
//       rs.addError(msg);


//       return rs;
//     }


//     @Override
//     public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {

//       String msg = "recibido rq = " + productCreateNewRQ.toString();

//       ProductCreateNewRS rs = new ProductCreateNewRS();
//       rs.addError(msg);


//       return rs;
//     }


//     @Override
//     public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {

      
//       String msg = "recibido rq = " + testConfigRQ.toString();

//       ProductCreateNewRS rs = new ProductCreateNewRS();
//       rs.addError(msg);


//       return rs;
//     }



//   public ServiceUtil getServiceUtil() {
//     return this.serviceUtil;
//   }


//   public ProductConfigPersistenceHelperImpl getPersistenceHelper() {
//     return this.persistenceHelper;
//   }


//   public ProductServiceGeneralMapper getMapper() {
//     return this.mapper;
//   }


    
}
