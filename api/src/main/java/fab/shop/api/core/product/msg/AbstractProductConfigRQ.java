package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;

public abstract class AbstractProductConfigRQ {
    private Integer shopId;

    private List<Product> productList = new ArrayList<>();
    private List<Article> articleList = new ArrayList<>();
    private List<Offer> offerList = new ArrayList<>();


    public AbstractProductConfigRQ() {
    }

    public AbstractProductConfigRQ(Integer shopId, List<Product> productList, List<Article> articleList, List<Offer> offerList) {
        this.shopId = shopId;
        this.productList = productList;
        this.articleList = articleList;
        this.offerList = offerList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Article> getArticleList() {
        return this.articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public List<Offer> getOfferList() {
        return this.offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

    public void addProduct(Product product){
        getProductList().add(product);
    }

    public void addArticle(Article article){
        getArticleList().add(article);
    }

    public void Offer(Offer offer){
        getOfferList().add(offer);
    }



    @Override
    public String toString() {
        String productListString = "{ ";
        for(Product product : getProductList()){
            productListString += product.toString();
            productListString += ", ";
        }
        productListString += " }";

        String articleListString = "{ ";
        for(Article article : getArticleList()){
            articleListString += article.toString();
            articleListString += ", ";
        }
        articleListString += " }";

        String offerListString = "{ ";
        for(Offer offer : getOfferList()){
            offerListString += offer.toString();
            offerListString += ", ";
        }
        offerListString += " }";

        return "{" +
            " shopId='" + getShopId() + "'" +
            ", productList='" + productListString + "'" +
            ", articleList='" + articleListString + "'" +
            ", offerList='" + offerListString + "'" +
            "}";
    }


}
