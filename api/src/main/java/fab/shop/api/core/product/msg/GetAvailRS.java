package fab.shop.api.core.product.msg;

import java.util.List;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Product;

public class GetAvailRS {

    private Integer shopId;
    private List<Product> productList;
    private List<Article> articleList;
    private List<OfferAvail> offerList;

    private String status;


    public GetAvailRS(Integer shopId, List<Product> productList, List<Article> articleList, List<OfferAvail> offerList, String status) {
        this.shopId = shopId;
        this.productList = productList;
        this.articleList = articleList;
        this.offerList = offerList;
        this.status = status;
    }


    public GetAvailRS() {
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

    public List<OfferAvail> getOfferList() {
        return this.offerList;
    }

    public void setOfferList(List<OfferAvail> offerList) {
        this.offerList = offerList;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        for(OfferAvail offerAvail : getOfferList()){
            offerListString += offerAvail.toString();
            offerListString += ", ";
        }
        offerListString += " }";

        return "{" +
            " shopId='" + getShopId() + "'" +
            ", productList='" + productListString + "'" +
            ", articleList='" + articleListString + "'" +
            ", offerList='" + offerListString + "'" +
           ", status='" + getStatus() + "'" +

            "}";
    }

    
}
