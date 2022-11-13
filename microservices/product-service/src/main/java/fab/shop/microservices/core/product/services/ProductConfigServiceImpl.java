package fab.shop.microservices.core.product.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Discount;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.ProductConfigService;
import fab.shop.api.core.product.Shop;
import fab.shop.api.core.product.Tax;
import fab.shop.api.core.product.msg.AbstractProductConfigRQ;
import fab.shop.api.core.product.msg.AbstractProductConfigRS;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductConfigRQ;
import fab.shop.api.core.product.msg.ProductConfigRS;
import fab.shop.api.core.product.msg.ProductCreateNewRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelperImpl;
import fab.shop.microservices.core.product.persistence.ProductEntity;
import fab.shop.microservices.core.product.persistence.ShopEntity;


@RestController
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
            System.out.println("ProductConfigServiceImpl - productCreateNew, recibido : " + productCreateNewRQ.toString());
        ProductCreateNewRS rs = new ProductCreateNewRS();

        rs.addError("recibido.toString = " + productCreateNewRQ.toString());
        rs.addError("*********************************************************");

        String initmsg = "object received in RQ : " + " shops=" + productCreateNewRQ.getShopList().size();
        initmsg += ", products=" + productCreateNewRQ.getProductList().size();
        initmsg += ", articles=" + productCreateNewRQ.getArticleList().size();        
        initmsg += ", offers=" + productCreateNewRQ.getOfferList().size();
        initmsg += ", discounts=" + productCreateNewRQ.getDiscountList().size();
        initmsg += ", taxes=" + productCreateNewRQ.getTaxList().size();

        rs.addError(initmsg);
        
        // shop

        for(Shop shop : productCreateNewRQ.getShopList()){
            ShopEntity entity = null;
            String shopString = shop.getName();
            try{
                entity = getPersistenceHelper().getShopRepository().save(getMapper().getShopMapper().apiToEntity(shop));
                rs.addError("shop created = " + entity.toString());

            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + shopString + " - msg : " + msg;
                rs.addError(errorString);
            }

        }
        
        // product
        
        for(Product product : productCreateNewRQ.getProductList()){
            String shopString = product.getShop().toString();
            String productString = product.toString();
            ShopEntity shopEntity = null;
            ProductEntity productEntity = getMapper().getProductMapper().apiToEntity(product);
            
            try{
                if(product.getShop().getId() == null){
                    shopEntity = getPersistenceHelper().getShopRepository().save(getMapper().getShopMapper().apiToEntity(product.getShop()));
                    rs.addError("shop created = " + shopEntity.toString());

                    productEntity.setShop(shopEntity);
                    productString = productEntity.toString();
                }
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + shopString + " - msg : " + msg;
                rs.addError(errorString);
            }
            try{
                productEntity = getPersistenceHelper().getProductRepository().save(productEntity);
                rs.addError("product created = " + productEntity.toString());
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + productString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }
        /*

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

 */

        return rs;
    }

    @Override
    public ProductConfigRS productConfig(ProductConfigRQ productConfigRQ) {

        String msg = "recibido : " + productConfigRQ.toString();


        ProductConfigRS rs = new ProductConfigRS();
        rs.addError(msg);



        return rs;
    }



    public ProductConfigPersistenceHelperImpl getPersistenceHelper() {
        return this.persistenceHelper;
    }


    public ProductServiceGeneralMapper getMapper() {
        return this.mapper;
    }




    
}
