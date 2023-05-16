package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.Product;

public class GetAvailRS extends ProductServiceErrorListRS {

    private Integer shopId;
    private List<Product> productList;
    private List<Article> articleList;
    private List<Offer> offerList;

    private String status;


    public GetAvailRS(Integer shopId, List<Product> productList, List<Article> articleList, List<Offer> offerList, String status, List<String> errorList) {
        this.shopId = shopId;
        this.productList = productList;
        this.articleList = articleList;
        this.offerList = offerList;
        this.status = status;
        this.errorList = errorList;
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
        if(this.productList == null){
            this.productList = new ArrayList<>();
        }
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Article> getArticleList() {
        if(this.articleList == null){
            this.articleList = new ArrayList<>();
        }
        return this.articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public List<Offer> getOfferList() {
        if(this.offerList == null){
            this.offerList = new ArrayList<>();
        }
        return this.offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addProduct(Product product){
        getProductList().add(product);
    }

    public void addArticle(Article article){
        getArticleList().add(article);
    }
    
    public void addOffer(Offer offer){
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
           ", status='" + getStatus() + "'" +

            "}";
    }

    
}
