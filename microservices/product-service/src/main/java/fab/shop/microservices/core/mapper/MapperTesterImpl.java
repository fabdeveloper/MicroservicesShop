package fab.shop.microservices.core.mapper;

import fab.shop.api.core.product.tester.MapperTester;
import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.Product;
import fab.shop.api.core.product.transfer.Shop;
import fab.shop.api.core.product.transfer.Tax;
import fab.shop.microservices.core.product.persistence.ArticleEntity;
import fab.shop.microservices.core.product.persistence.DiscountEntity;
import fab.shop.microservices.core.product.persistence.OfferEntity;
import fab.shop.microservices.core.product.persistence.ProductEntity;
import fab.shop.microservices.core.product.persistence.ShopEntity;
import fab.shop.microservices.core.product.persistence.TaxEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MapperTesterImpl implements MapperTester {

    @Autowired
    private ProductServiceGeneralMapper mapper;
    

    public ProductServiceGeneralMapper getMapper() {
        return this.mapper;
    }

    public void setMapper(ProductServiceGeneralMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public String getShopApiObject() {
        String result = "NO_INICIALIZADO";
        // List<Integer> adminList = new ArrayList<Integer>();
        // adminList.add(33);        adminList.add(99);
        ShopEntity entity = new ShopEntity(66, null, "my shop", "my shop description", "my shop remarks", 2);
        Shop shop = getMapper().getShopMapper().entityToApi(entity);

        if(shop != null){
            result = shop.toString();
        }
        return result;
    }

    @Override
    public String getShopEntityObject() {
        String result = "NO_INICIALIZADO";
        List<Integer> adminList = new ArrayList<Integer>();
        adminList.add(3);        adminList.add(9);
        Shop shop = new Shop(6, "shop name", "shop description", "shop remarks", 1);
        ShopEntity entity = getMapper().getShopMapper().apiToEntity(shop);

        if(entity != null){
            result = entity.toString();
        }
        return result;
    }

    @Override
    public String getProductApiObject() {
        String result = "NO_INICIALIZADO";
        ShopEntity shopentity = new ShopEntity(66, null, "my shop", "my shop description", "my shop remarks", 2);
        ProductEntity entity = new ProductEntity(77, null,  "product name", "product description", "product remarks", shopentity, "product type");

        Product apiObject = getMapper().getProductMapper().entityToApi(entity);
        if(apiObject != null){
            result = apiObject.toString();
        }
        return result;
    }

    @Override
    public String getProductEntityObject() {
        String result = "NO_INICIALIZADO";
        Shop shop = new Shop(6, "shop name", "shop description", "shop remarks", 1);
        Product apiObject = new Product(23, "product name", "product description", "product remarks", shop, "product type", "product service address");
        ProductEntity entity = getMapper().getProductMapper().apiToEntity(apiObject);
        
        if(entity != null){
            result = entity.toString();
        }        
        return result;
    }

    @Override
    public String getArticleApiObject() {
        String result = "NO_INICIALIZADO";
        ShopEntity shopentity = new ShopEntity(66, null, "my shop", "my shop description", "my shop remarks", 2);
        ProductEntity productentity = new ProductEntity(23, null, "product name", "product description", "product remarks", shopentity, "product type");
        ArticleEntity entity = new ArticleEntity(34, null, "article name", "article description", "article remarks", productentity);

        Article apiObject = getMapper().getArticleMapper().entityToApi(entity);
        if(apiObject != null){
            result = apiObject.toString();
        }
        return result;
    }

    @Override
    public String getArticleEntityObject() {
        String result = "NO_INICIALIZADO";
        Shop shop = new Shop(6, "shop name", "shop description", "shop remarks", 1);
        Product product = new Product(23, "product name", "product description", "product remarks", shop, "product type", "product service address");
 
        Article apiObject = new Article(45, "article name", "article description", "article remarks", product);
        ArticleEntity entity = getMapper().getArticleMapper().apiToEntity(apiObject);
        if(entity != null){
            result = entity.toString();
        }  
        return result;
    }

    @Override
    public String getOfferApiObject() {
        String result = "NO_INICIALIZADO";
        ShopEntity shopentity = new ShopEntity(66, null, "my shop", "my shop description", "my shop remarks", 2);
        ProductEntity productentity = new ProductEntity(12, null, "product name", "product description", "product remarks", shopentity, "product type");
        ArticleEntity articleentity = new ArticleEntity(34, null, "article name", "article description", "article remarks", productentity);

        List<DiscountEntity> discounList = new ArrayList<DiscountEntity>();
        DiscountEntity discountEntity = new DiscountEntity(123, null, "discount name", "discount description", "discount remarks", 10.00f, null);
        discounList.add(discountEntity);
        
        
        List<TaxEntity> taxList = new ArrayList<TaxEntity>();
        TaxEntity taxEntity = new TaxEntity(234, null, "tax name", "tax description", "tax remarks", 21.00f, null);

        taxList.add(taxEntity);        
        OfferEntity entity = new OfferEntity(56, null, "offer name", "offer description", "offer remarks", 9.99f, articleentity, discounList, taxList, new Date(), new Date(), true, 10, 10);

        Offer apiObject = getMapper().getOfferMapper().entityToApi(entity);    
        if(apiObject != null){
            result = apiObject.toString();
        }
        return result;
    }

    @Override
    public String getOfferEntityObject() {
        String result = "NO_INICIALIZADO";
        Shop shop = new Shop(6, "shop name", "shop description", "shop remarks", 1);
        Product product = new Product(23, "product name", "product description", "product remarks", shop, "product type", "product service address");
        Article article = new Article(45, "article name", "article description", "article remarks", product);

        List<Discount> discountList = new ArrayList<Discount>();
        Discount discount = new Discount(543, "discount name", "discount description", "discount remarks", 15.00f, null);
        discountList.add(discount);

        List<Tax> taxList = new ArrayList<Tax>();
        Tax tax = new Tax(111,  "tax name", "tax description", "tax remarks", 46.00f, null);
        taxList.add(tax);

        Offer apiObject = new Offer(456, "offer name", "offer description", "offer remarks", 9.99f, article, discountList, taxList, new Date(), new Date(), true, 9, 9);
        
        OfferEntity entity = getMapper().getOfferMapper().apiToEntity(apiObject);
        if(entity != null){
            result = entity.toString();
        }  
        return result;
    }

    @Override
    public String getDiscountApiObject() {
        String result = "NO_INICIALIZADO";
        DiscountEntity entity = new DiscountEntity(222, null, "discount name", "discount description", "discount remarks", 98.00f, null);

        Discount apiObject = getMapper().getDiscountMapper().entityToApi(entity);
        if(apiObject != null){
            result = apiObject.toString();
        }
        return result;
    }

    @Override
    public String getDiscountEntityObject() {
        String result = "NO_INICIALIZADO";
        Discount apiObject = new Discount(555, "discount name", "discount description", "discount remarks", 43.00f, null);

        DiscountEntity entity = getMapper().getDiscountMapper().apiToEntity(apiObject);
        if(entity != null){
            result = entity.toString();
        }  
        return result;
    }

    @Override
    public String getTaxApiObject() {
        String result = "NO_INICIALIZADO";
        TaxEntity entity = new TaxEntity(789, null, "tax name", "tax description", "tax remarks", 97.00f, null);

        Tax apiObject = getMapper().getTaxMapper().entityToApi(entity);
        if(apiObject != null){
            result = apiObject.toString();
        }
        return result;
    }

    @Override
    public String getTaxEntityObject() {
        String result = "NO_INICIALIZADO";
        Tax apiObject = new Tax(333, "tax name", "tax description", "tax remarks", 12.00f, null);
        TaxEntity entity = getMapper().getTaxMapper().apiToEntity(apiObject);        
        if(entity != null){
            result = entity.toString();
        }  
        return result;
    }

    @Override
    public String getTestAllMappersString() {
        String result = null;

        // StringBuilder result = new StringBuilder();
        // result.append(getTestAllMappersString());

        String shopApiObjectString = this.getShopApiObject();
        String shopEntityObjectString = this.getShopEntityObject();

        result = "shopApiObjectString : " + shopApiObjectString + ", ";
        result += "shopEntityObjectString : " + shopEntityObjectString + ", ";

        String productApiObjectString = this.getProductApiObject();
        String productEntityObjectString = this.getProductEntityObject();

        result += "productApiObjectString : " + productApiObjectString + ", ";
        result += "productEntityObjectString : " + productEntityObjectString + ", ";

        String articleApiObjectString = this.getArticleApiObject();
        String articleEntityObjectString = this.getArticleEntityObject();
        
        result += "articleApiObjectString : " + articleApiObjectString + ", ";
        result += "articleEntityObjectString : " + articleEntityObjectString + ", ";

        String offerApiObjectString = this.getOfferApiObject();
        String offerEntityObjectString = this.getOfferEntityObject();
        
        result += "offerApiObjectString : " + offerApiObjectString + ", ";
        result += "offerEntityObjectString : " + offerEntityObjectString + ", ";

        String discountApiObjectString = this.getDiscountApiObject();
        String discountEntityObjecString = this.getDiscountEntityObject();
        
        result += "discountApiObjectString : " + discountApiObjectString + ", ";
        result += "discountEntityObjecString : " + discountEntityObjecString + ", ";

        String taxApiObjectString = this.getTaxApiObject();
        String taxEntityObjectString = this.getTaxEntityObject();
        
        result += "taxApiObjectString : " + taxApiObjectString + ", ";
        result += "taxEntityObjectString : " + taxEntityObjectString + ", ";

        return result;
    }
    
}
