package fab.shop.microservices.core.product.helper;

import fab.shop.microservices.core.product.persistence.ArticleRepository;
import fab.shop.microservices.core.product.persistence.DiscountRepository;
import fab.shop.microservices.core.product.persistence.OfferPurchaseRepository;
import fab.shop.microservices.core.product.persistence.OfferRepository;
import fab.shop.microservices.core.product.persistence.ProductBookingRepository;
import fab.shop.microservices.core.product.persistence.ProductRepository;
import fab.shop.microservices.core.product.persistence.ShopRepository;
import fab.shop.microservices.core.product.persistence.TaxRepository;

public interface ProductConfigPersistenceHelper {
    
    public ShopRepository getShopRepository();

    public ProductRepository getProductRepository();

    public ArticleRepository getArticleRepository();

    public OfferRepository getOfferRepository();

    public DiscountRepository getDiscountRepository();

    public TaxRepository getTaxRepository();

    public ProductBookingRepository getProductBookingRepository();

    public OfferPurchaseRepository getOfferPurchaseRepository();

    
}
