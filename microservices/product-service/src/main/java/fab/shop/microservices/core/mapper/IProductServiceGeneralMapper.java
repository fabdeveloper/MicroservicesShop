package fab.shop.microservices.core.mapper;

public interface IProductServiceGeneralMapper {
    public ShopMapper getShopMapper();
    public ProductMapper getProductMapper();
    public ArticleMapper getArticleMapper();
    public OfferMapper getOfferMapper();
    public TaxMapper getTaxMapper();
    public DiscountMapper getDiscountMapper();
}
