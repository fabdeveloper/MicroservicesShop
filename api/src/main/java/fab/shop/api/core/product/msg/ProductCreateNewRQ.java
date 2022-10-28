package fab.shop.api.core.product.msg;

import java.util.List;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;

public class ProductCreateNewRQ extends AbstractProductConfigRQ {


    public ProductCreateNewRQ(Integer shopId, List<Product> productList, List<Article> articleList, List<Offer> offerList) {
        super(shopId, productList, articleList, offerList);
    }


    public ProductCreateNewRQ() {
        super();
    }




    
}
