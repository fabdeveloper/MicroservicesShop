package fab.shop.microservices.core.product.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.microservices.core.product.persistence.ArticleRepository;
import fab.shop.microservices.core.product.persistence.DiscountRepository;
import fab.shop.microservices.core.product.persistence.OfferRepository;
import fab.shop.microservices.core.product.persistence.ProductRepository;
import fab.shop.microservices.core.product.persistence.ShopRepository;
import fab.shop.microservices.core.product.persistence.TaxRepository;


@Component
public class ProductConfigPersistenceHelperImpl implements ProductConfigPersistenceHelper {

    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private DiscountRepository discountRepository;
    @Autowired
    private TaxRepository taxRepository;



    public ProductConfigPersistenceHelperImpl() {
    }



    public ProductConfigPersistenceHelperImpl(ShopRepository shopRepository, ProductRepository productRepository, ArticleRepository articleRepository, OfferRepository offerRepository, DiscountRepository discountRepository, TaxRepository taxRepository) {
        this.shopRepository = shopRepository;
        this.productRepository = productRepository;
        this.articleRepository = articleRepository;
        this.offerRepository = offerRepository;
        this.discountRepository = discountRepository;
        this.taxRepository = taxRepository;
    }


    @Override
    public ShopRepository getShopRepository() {
        return this.shopRepository;
    }

    @Override
    public ProductRepository getProductRepository() {
        return this.productRepository;
    }

    @Override
    public ArticleRepository getArticleRepository() {
        return this.articleRepository;
    }

    @Override
    public OfferRepository getOfferRepository() {
        return this.offerRepository;
    }

    @Override
    public DiscountRepository getDiscountRepository() {
        return this.discountRepository;
    }

    @Override
    public TaxRepository getTaxRepository() {
        return this.taxRepository;
    }

    public void setShopRepository(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void setArticleRepository(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public void setOfferRepository(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }
    public void setDiscountRepository(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }
    public void setTaxRepository(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }


    
}
