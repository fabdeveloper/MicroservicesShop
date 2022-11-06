package fab.shop.api.core.product.msg;

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
        return this.productList;
    }

    public void setProductList(List<Integer> productList) {
        this.productList = productList;
    }

    public List<Integer> getArticleList() {
        return this.articleList;
    }

    public void setArticleList(List<Integer> articleList) {
        this.articleList = articleList;
    }

    public List<Integer> getOfferList() {
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
