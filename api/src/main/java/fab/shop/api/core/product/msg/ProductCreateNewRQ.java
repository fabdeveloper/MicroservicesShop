package fab.shop.api.core.product.msg;

import java.util.List;

import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.Product;
import fab.shop.api.core.product.transfer.Shop;
import fab.shop.api.core.product.transfer.Tax;

public class ProductCreateNewRQ extends AbstractProductConfigRQ {


    public ProductCreateNewRQ(Integer shopId, List<Shop> shopList, List<Product> productList, List<Article> articleList, List<Offer> offerList, List<Discount> discountList, List<Tax> taxList) {
        super(shopId, shopList, productList, articleList, offerList, discountList, taxList);
    }


    public ProductCreateNewRQ() {
        super();
    }




    
}
