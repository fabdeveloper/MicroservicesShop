package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

public class GetAvailRQ {

    private Integer shopId;
    private List<Integer> productList;
    private List<Integer> articleList;
    private List<Integer> offerList;


    public GetAvailRQ() {
    }

    public GetAvailRQ(Integer shopId, List<Integer> productList, List<Integer> articleList, List<Integer> offerList) {
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

    public List<Integer> getProductList() {
        if(this.productList == null){
            this.productList = new ArrayList<>();
        }
        return this.productList;
    }

    public void setProductList(List<Integer> productList) {
        this.productList = productList;
    }

    public List<Integer> getArticleList() {
        if(this.articleList == null){
            this.articleList = new ArrayList<>();
        }
        return this.articleList;
    }

    public void setArticleList(List<Integer> articleList) {
        this.articleList = articleList;
    }

    public List<Integer> getOfferList() {
        if(this.offerList == null){
            this.offerList = new ArrayList<>();
        }
        return this.offerList;
    }

    public void setOfferList(List<Integer> offerList) {
        this.offerList = offerList;
    }

    public GetAvailRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public GetAvailRQ productList(List<Integer> productList) {
        setProductList(productList);
        return this;
    }

    public GetAvailRQ articleList(List<Integer> articleList) {
        setArticleList(articleList);
        return this;
    }

    public GetAvailRQ offerList(List<Integer> offerList) {
        setOfferList(offerList);
        return this;
    }

    public void addProduct(Integer productId){
        getProductList().add(productId);
    }
    
    public void addArticle(Integer articleId){
        getArticleList().add(articleId);
    }
    
    public void addOffer(Integer offerId){
        getOfferList().add(offerId);
    }
 


    @Override
    public String toString() {
        String productListString = (getProductList() != null ? getProductList().toString() : "null");
        String articleListString = (getArticleList() != null ? getArticleList().toString() : "null");
        String offerListString = (getOfferList() != null ? getOfferList().toString() : "null");

        return "{" +
            " shopId='" + getShopId() + "'" +
            ", productList='" + productListString + "'" +
            ", articleList='" + articleListString + "'" +
            ", offerList='" + offerListString + "'" +
            "}";
    }

    
    
}
