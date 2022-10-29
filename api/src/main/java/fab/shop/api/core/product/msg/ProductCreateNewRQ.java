package fab.shop.api.core.product.msg;

import java.util.List;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Discount;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.Shop;
import fab.shop.api.core.product.Tax;

public class ProductCreateNewRQ extends AbstractProductConfigRQ {


    public ProductCreateNewRQ(Integer shopId, List<Shop> shopList, List<Product> productList, List<Article> articleList, List<Offer> offerList, List<Discount> discountList, List<Tax> taxList) {
        super(shopId, shopList, productList, articleList, offerList, discountList, taxList);
    }


    public ProductCreateNewRQ() {
        super();
    }




    
}
