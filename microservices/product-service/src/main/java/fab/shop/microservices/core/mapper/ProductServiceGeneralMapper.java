package fab.shop.microservices.core.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceGeneralMapper {

    @Autowired
    private ShopMapper shopMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private OfferMapper offerMapper;
    @Autowired
    private DiscountMapper discountMapper;
    @Autowired
    private TaxMapper taxMapper;



    public ProductServiceGeneralMapper() {
    }


    public ShopMapper getShopMapper() {
        return this.shopMapper;
    }

    public void setShopMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    public ProductMapper getProductMapper() {
        return this.productMapper;
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public ArticleMapper getArticleMapper() {
        return this.articleMapper;
    }

    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public OfferMapper getOfferMapper() {
        return this.offerMapper;
    }

    public void setOfferMapper(OfferMapper offerMapper) {
        this.offerMapper = offerMapper;
    }

    public DiscountMapper getDiscountMapper() {
        return this.discountMapper;
    }

    public void setDiscountMapper(DiscountMapper discountMapper) {
        this.discountMapper = discountMapper;
    }

    public TaxMapper getTaxMapper() {
        return this.taxMapper;
    }

    public void setTaxMapper(TaxMapper taxMapper) {
        this.taxMapper = taxMapper;
    }


    
}
