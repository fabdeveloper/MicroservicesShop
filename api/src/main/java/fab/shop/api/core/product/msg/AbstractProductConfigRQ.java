package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.Product;
import fab.shop.api.core.product.transfer.Shop;
import fab.shop.api.core.product.transfer.Tax;

public abstract class AbstractProductConfigRQ {

    protected Integer shopId;
    protected List<Shop> shopList;
    protected List<Product> productList;
    protected List<Article> articleList;
    protected List<Offer> offerList;
    protected List<Discount> discountList;
    protected List<Tax> taxList;



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
        if(this.shopList == null){
            this.shopList = new ArrayList<>();
        }
        return this.shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
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

    public List<Discount> getDiscountList() {
        if(this.discountList == null){
            this.discountList = new ArrayList<>();
        }
        return this.discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public List<Tax> getTaxList() {
        if(this.taxList == null){
            this.taxList = new ArrayList<>();
        }
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
