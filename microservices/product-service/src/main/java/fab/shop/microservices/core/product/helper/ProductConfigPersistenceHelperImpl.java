package fab.shop.microservices.core.product.helper;

import org.springframework.beans.factory.annotation.Autowired;

import fab.shop.microservices.core.product.persistence.ArticleRepository;
import fab.shop.microservices.core.product.persistence.DiscountRepository;
import fab.shop.microservices.core.product.persistence.OfferRepository;
import fab.shop.microservices.core.product.persistence.ProductRepository;
import fab.shop.microservices.core.product.persistence.ShopRepository;
import fab.shop.microservices.core.product.persistence.TaxRepository;

public class ProductConfigPersistenceHelperImpl implements ProductConfigPersistenceHelper {

    private final ShopRepository shopRepository;
    private final ProductRepository productRepository;
    private final ArticleRepository articleRepository;
    private final OfferRepository offerRepository;
    private final DiscountRepository discountRepository;
    private final TaxRepository taxRepository;




    @Autowired
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

    
}
