package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Discount;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.Shop;
import fab.shop.api.core.product.Tax;

public abstract class AbstractProductConfigRQ {
    private Integer shopId;

    private List<Shop> shopList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();
    private List<Article> articleList = new ArrayList<>();
    private List<Offer> offerList = new ArrayList<>();
    private List<Discount> discountList = new ArrayList<>();
    private List<Tax> taxList = new ArrayList<>();



    public AbstractProductConfigRQ() {
    }




    public AbstractProductConfigRQ(Integer shopId, List<Shop> shopList, List<Product> productList, List<Article> articleList, List<Offer> offerList, List<Discount> discountList, List<Tax> taxList) {
        this.shopId = shopId;
        this.shopList = shopList;
        this.productList = productList;
        this.articleList = articleList;
        this.offerList = offerList;
        this.discountList = discountList;
        this.taxList = taxList;
    }
    
    
    

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }


    public List<Shop> getShopList() {
        return this.shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
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

    public List<Discount> getDiscountList() {
        return this.discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public List<Tax> getTaxList() {
        return this.taxList;
    }

    public void setTaxList(List<Tax> taxList) {
        this.taxList = taxList;
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

    public void addShop(Shop shop){
        getShopList().add(shop);
    }

    public void addDiscount(Discount discount){
        getDiscountList().add(discount);
    }

    public void addTax(Tax tax){
        getTaxList().add(tax);
    }



    @Override
    public String toString() {

        String shopListString = "{ ";
        for(Shop shop : getShopList()){
            shopListString += shop.toString();
            shopListString += ", ";
        }
        shopListString += " }";

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
        
        String discountListString = "{ ";
        for(Discount discount : getDiscountList()){
            discountListString += discount.toString();
            discountListString += ", ";
        }
        discountListString += " }";
        
        String taxListString = "{ ";
        for(Tax tax : getTaxList()){
            taxListString += tax.toString();
            taxListString += ", ";
        }
        taxListString += " }";

        return "{" +
            " shopId='" + getShopId() + "'" +
            ", shopList='" + shopListString + "'" +
            ", productList='" + productListString + "'" +
            ", articleList='" + articleListString + "'" +
            ", offerList='" + offerListString + "'" +
            ", offerList='" + offerListString + "'" +
            ", discountList='" + discountListString + "'" +
            ", taxList='" + taxListString + "'" +
            "}";
    }


}
