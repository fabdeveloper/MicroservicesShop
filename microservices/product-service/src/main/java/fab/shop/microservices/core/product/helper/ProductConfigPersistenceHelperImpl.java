package fab.shop.microservices.core.product.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.microservices.core.product.persistence.ArticleRepository;
import fab.shop.microservices.core.product.persistence.DiscountRepository;
import fab.shop.microservices.core.product.persistence.OfferPurchaseRepository;
import fab.shop.microservices.core.product.persistence.OfferRepository;
import fab.shop.microservices.core.product.persistence.ProductBookingRepository;
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
    @Autowired
    private ProductBookingRepository productBookingRepository;
    @Autowired
    private OfferPurchaseRepository offerPurchaseRepository;



    public ProductConfigPersistenceHelperImpl() {
    }


    public ProductConfigPersistenceHelperImpl(ShopRepository shopRepository, ProductRepository productRepository, ArticleRepository articleRepository, OfferRepository offerRepository, DiscountRepository discountRepository, TaxRepository taxRepository, ProductBookingRepository productBookingRepository) {
        this.shopRepository = shopRepository;
        this.productRepository = productRepository;
        this.articleRepository = articleRepository;
        this.offerRepository = offerRepository;
        this.discountRepository = discountRepository;
        this.taxRepository = taxRepository;
        this.productBookingRepository = productBookingRepository;
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
    
    @Override
    public ProductBookingRepository getProductBookingRepository() {
        return this.productBookingRepository;
    }

    @Override
    public OfferPurchaseRepository getOfferPurchaseRepository() {
        return this.offerPurchaseRepository;
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
    public void setProductBookingRepository(ProductBookingRepository productBookingRepository) {
        this.productBookingRepository = productBookingRepository;
    }

    public void setOfferPurchaseRepository(OfferPurchaseRepository offerPurchaseRepository) {
        this.offerPurchaseRepository = offerPurchaseRepository;
    }




    
}
