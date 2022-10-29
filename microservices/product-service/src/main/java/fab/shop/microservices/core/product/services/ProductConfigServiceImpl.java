package fab.shop.microservices.core.product.services;


import org.springframework.beans.factory.annotation.Autowired;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Discount;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.ProductConfigService;
import fab.shop.api.core.product.Shop;
import fab.shop.api.core.product.Tax;
import fab.shop.api.core.product.msg.ProductConfigRQ;
import fab.shop.api.core.product.msg.ProductConfigRS;
import fab.shop.api.core.product.msg.ProductCreateNewRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelperImpl;



public class ProductConfigServiceImpl implements ProductConfigService {

    private final ProductConfigPersistenceHelperImpl persistenceHelper;
    private final ProductServiceGeneralMapper mapper;

    
    @Autowired
    public ProductConfigServiceImpl(ProductConfigPersistenceHelperImpl persistenceHelper, ProductServiceGeneralMapper mapper) {
        this.persistenceHelper = persistenceHelper;
        this.mapper = mapper;
    }
    


    @Override
    public ProductCreateNewRS productCreateNew(ProductCreateNewRQ productCreateNewRQ) {
        ProductCreateNewRS rs = new ProductCreateNewRS();

        // shop

        for(Shop shop : productCreateNewRQ.getShopList()){
            String shopString = shop.toString();
            try{
                getPersistenceHelper().getShopRepository().save(getMapper().getShopMapper().apiToEntity(shop));
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + shopString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // product
        
        for(Product product : productCreateNewRQ.getProductList()){
            String productString = product.toString();
            try{
                getPersistenceHelper().getProductRepository().save(getMapper().getProductMapper().apiToEntity(product));
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + productString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // article
        
        for(Article article : productCreateNewRQ.getArticleList()){
            String articleString = article.toString();
            try{
                getPersistenceHelper().getArticleRepository().save(getMapper().getArticleMapper().apiToEntity(article));
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + articleString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // offer
        for(Offer offer : productCreateNewRQ.getOfferList()){
            String offerString = offer.toString();
            try{
                getPersistenceHelper().getOfferRepository().save(getMapper().getOfferMapper().apiToEntity(offer));
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + offerString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // discount
        for(Discount discount : productCreateNewRQ.getDiscountList()){
            String discountString = discount.toString();
            try{
                getPersistenceHelper().getDiscountRepository().save(getMapper().getDiscountMapper().apiToEntity(discount));
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + discountString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // tax
        for(Tax tax : productCreateNewRQ.getTaxList()){
            String taxString = tax.toString();
            try{
                getPersistenceHelper().getTaxRepository().save(getMapper().getTaxMapper().apiToEntity(tax));
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + taxString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }



        return rs;
    }

    @Override
    public ProductConfigRS productConfig(ProductConfigRQ productConfigRQ) {
        // TODO Auto-generated method stub
        return null;
    }



    public ProductConfigPersistenceHelperImpl getPersistenceHelper() {
        return this.persistenceHelper;
    }


    public ProductServiceGeneralMapper getMapper() {
        return this.mapper;
    }




    
}
