package fab.shop.microservices.core.product.services;

import javax.transaction.Transactional;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.api.core.product.ProductConfigService;
import fab.shop.api.core.product.msg.AbstractProductConfigRQ;
import fab.shop.api.core.product.msg.AbstractProductConfigRS;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductConfigRQ;
import fab.shop.api.core.product.msg.ProductConfigRS;
import fab.shop.api.core.product.msg.ProductCreateNewRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.Product;
import fab.shop.api.core.product.transfer.Shop;
import fab.shop.api.core.product.transfer.Tax;
import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelperImpl;
import fab.shop.microservices.core.product.persistence.ArticleEntity;
import fab.shop.microservices.core.product.persistence.DiscountEntity;
import fab.shop.microservices.core.product.persistence.OfferEntity;
import fab.shop.microservices.core.product.persistence.ProductEntity;
import fab.shop.microservices.core.product.persistence.ShopEntity;
import fab.shop.microservices.core.product.persistence.TaxEntity;


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
    @Transactional
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
                entity = getAliveShopEntity(shop);
                // entity = getPersistenceHelper().getShopRepository().save(getMapper().getShopMapper().apiToEntity(shop));
                rs.addError("shop created = " + entity.toString());
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + shopString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }
        
        // product
        
        for(Product product : productCreateNewRQ.getProductList()){
            // String shopString = product.getShop().toString();
            // ShopEntity shopEntity = null;

            String productString = product.toString();
            ProductEntity productEntity = getMapper().getProductMapper().apiToEntity(product);
            
            // try{
            //     if(product.getShop().getId() == null){
            //         shopEntity = getPersistenceHelper().getShopRepository().save(getMapper().getShopMapper().apiToEntity(product.getShop()));
            //         rs.addError("shop created = " + shopEntity.toString());

            //         productEntity.setShop(shopEntity);
            //         productString = productEntity.toString();
            //     }
            // }catch(Throwable t){
            //     String msg = t.getMessage();
            //     String errorString = "error creating = " + shopString + " - msg : " + msg;
            //     rs.addError(errorString);
            // }
            try{
                // productEntity = getPersistenceHelper().getProductRepository().save(productEntity);

                productEntity = getAliveProductEntity(product);
                rs.addError("product created = " + productEntity.toString());
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + productString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }
        
        // article
        
        for(Article article : productCreateNewRQ.getArticleList()){
            String articleString = article.toString();
            ArticleEntity articleEntity = null;
            try{
                articleEntity = getAliveArticleEntity(article);
                rs.addError("article created = " + articleEntity.toString());

            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + articleString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // offer
        for(Offer offer : productCreateNewRQ.getOfferList()){
            String offerString = offer.toString();
            OfferEntity offerEntity = null;
            try{
                offerEntity = getAliveOfferEntity(offer);                
                rs.addError("offer created = " + offerEntity.toString());
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + offerString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // discount
        for(Discount discount : productCreateNewRQ.getDiscountList()){
            String discountString = discount.toString();
            DiscountEntity discountEntity = null;
            try{
                discountEntity = getAliveDiscountEntity(discount);                
                rs.addError("diuscount created = " + discountEntity.toString());
            }catch(Throwable t){
                String msg = t.getMessage();
                String errorString = "error creating = " + discountString + " - msg : " + msg;
                rs.addError(errorString);
            }
        }

        // tax
        for(Tax tax : productCreateNewRQ.getTaxList()){
            String taxString = tax.toString();
            TaxEntity taxEntity = null;
            try{
                taxEntity = getAliveTaxEntity(tax);                
                rs.addError("tax created = " + taxEntity.toString());
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


    private ShopEntity getAliveShopEntity(Shop shop){
        ShopEntity entity = null;
        ShopEntity temp = getMapper().getShopMapper().apiToEntity(shop);

        if(shop.getId() == null){
            entity = getPersistenceHelper().getShopRepository().save(temp);
        }else{
            entity = getPersistenceHelper().getShopRepository().findById(shop.getId()).get();            
        }
        return entity;
    }

    private ProductEntity getAliveProductEntity(Product product){
        ProductEntity entity = null;
        ProductEntity temp = getMapper().getProductMapper().apiToEntity(product);
        ShopEntity shopEntity = null;

        if(product.getId() == null){
            shopEntity = getAliveShopEntity(product.getShop());
            temp.setShop(shopEntity);
            entity = getPersistenceHelper().getProductRepository().save(temp);
        }else{
            entity = getPersistenceHelper().getProductRepository().findById(product.getId()).get();
        }

        return entity;
    }

    private ArticleEntity getAliveArticleEntity(Article article){
        ArticleEntity entity = null;
        ArticleEntity temp = getMapper().getArticleMapper().apiToEntity(article);

        if(article.getId() != null){
            entity = getPersistenceHelper().getArticleRepository().findById(article.getId()).get();
        }else{
            ProductEntity productEntity = getAliveProductEntity(article.getProduct());
            temp.setProduct(productEntity);
            entity = getPersistenceHelper().getArticleRepository().save(temp);
        }

        return entity;
    }

    private OfferEntity getAliveOfferEntity(Offer offer){
        OfferEntity entity = null;
        OfferEntity temp = getMapper().getOfferMapper().apiToEntity(offer);

        if(offer.getId() != null){
            entity = getPersistenceHelper().getOfferRepository().findById(offer.getId()).get();
        }else{
            ArticleEntity articleEntity = getAliveArticleEntity(offer.getArticle());
            temp.setArticle(articleEntity);
            // discount list
            List<DiscountEntity> discountEntityList = new ArrayList<>();
            // DiscountEntity discountEntity = null;
            for(Discount discount : offer.getDiscountList()){
                // discountEntity = getAliveDiscountEntity(discount);
                discountEntityList.add(getAliveDiscountEntity(discount));
            }
            temp.setDiscountList(discountEntityList);
            
            // tax list

            List<TaxEntity> taxEntityList = new ArrayList<>();
            // TaxEntity taxEntity = null;
            for(Tax tax : offer.getTaxList()){
                // taxEntity = getAliveTaxEntity(tax);
                taxEntityList.add(getAliveTaxEntity(tax));
            }
            temp.setTaxList(taxEntityList);

            entity = getPersistenceHelper().getOfferRepository().save(temp);
        }

        return entity;
    }

    private DiscountEntity getAliveDiscountEntity(Discount discount){
        DiscountEntity entity = null;
        DiscountEntity temp = getMapper().getDiscountMapper().apiToEntity(discount);

        if(discount.getId() != null){
            entity = getPersistenceHelper().getDiscountRepository().findById(discount.getId()).get();
        }else{
            entity = getPersistenceHelper().getDiscountRepository().save(temp);
        }
        return entity;
    }

    private TaxEntity getAliveTaxEntity(Tax tax){
        TaxEntity entity = null;
        TaxEntity temp = getMapper().getTaxMapper().apiToEntity(tax);

        if(tax.getId() != null){
            entity = getPersistenceHelper().getTaxRepository().findById(tax.getId()).get();
        }else{
            entity = getPersistenceHelper().getTaxRepository().save(temp);
        }

        return entity;
    }




    
}
