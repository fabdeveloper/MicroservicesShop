package fab.shop.microservices.core.product.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.microservices.core.product.facade.IPersistenceFacade;
import fab.shop.microservices.core.product.persistence.ArticleEntity;
import fab.shop.microservices.core.product.persistence.OfferEntity;

@Component
public class ProductAvailabilityHelperImpl implements IProductAvailabilityHelper {

    @Autowired
    private IPersistenceFacade persistenceFacade;


    public IPersistenceFacade getPersistenceFacade() {
        return this.persistenceFacade;
    }

    public void setPersistenceFacade(IPersistenceFacade persistenceFacade) {
        this.persistenceFacade = persistenceFacade;
    }



    @Transactional
    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {

        GetAvailRS rs = new GetAvailRS();
      String msg = "ProductServiceImpl - getAvail() - recibido rq = " + getAvailRQ.toString();


      if(getAvailRQ.getShopId() == null){
        msg += "-------------------------------------->  " + "   ERROR : shopId is null";
        rs.setStatus(msg);
        return rs;
      }

      List<Article> articleList;   
      for(Integer productId : getAvailRQ.getProductList()){
        articleList = getArticleListFromProductId(productId);
        for(Article article : articleList){
          rs.addArticle(article);
        }
      }

      List<Offer> offerList;
      for(Integer articleId : getAvailRQ.getArticleList()){
        offerList = getOfferListFromArticleId(articleId);
        for(Offer offer : offerList){
          rs.addOffer(offer);
        }
      }

      rs.setStatus(msg);
      return rs;
    }

    
    private List<Article> getArticleListFromProductId(Integer productId){
      List<Article> articleList = null;
      List<ArticleEntity> entityList = getPersistenceFacade().getPersistenceHelper().getArticleRepository().findByProductId(productId);

      articleList =  getPersistenceFacade().getGeneralMapper().getArticleMapper().entityListToApiList(entityList);
      return articleList;
    }

    private List<Offer> getOfferListFromArticleId(Integer articleId){
      List<Offer> offerList = null;
      List<OfferEntity> entityList = getPersistenceFacade().getPersistenceHelper().getOfferRepository().findByArticleId(articleId);

      offerList =  getPersistenceFacade().getGeneralMapper().getOfferMapper().entityListToApiList(entityList);
      return offerList;
    }


    @Transactional
    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
      GetOfferListDetailRS rs = new GetOfferListDetailRS();

      String msg = "recibido rq = " + getOfferListDetailRQ.toString();
      rs.setStatus(msg);

      Offer offer = null;
      OfferEntity entity = null;
      for(Integer offerId : getOfferListDetailRQ.getOfferList()){
        try {              
            entity = getPersistenceFacade().getPersistenceHelper().getOfferRepository().findById(offerId).get();
            if(entity !=  null){
              offer = getPersistenceFacade().getGeneralMapper().getOfferMapper().entityToApi(entity);
              rs.addOffer(offer);
            }  
          
        } catch (Throwable e) {
            String sError = "ERROR - offer: " + offerId + " , not found";
            rs.addError(sError);
        }
      }
      return rs;
    }
    
}
