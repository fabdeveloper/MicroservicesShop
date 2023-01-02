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





//     // private List getApiObjectListFromParentId(){
//     //   List apiList = null;


//     //   return apiList;
//     // }



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







//   public ServiceUtil getServiceUtil() {
//     return this.serviceUtil;
//   }

    
}
