package fab.shop.api.core.product.msg;



import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.Product;
import fab.shop.api.core.product.transfer.Shop;
import fab.shop.api.core.product.transfer.Tax;





public class ProductConfigBasicRQ {

    protected Integer shopId;
    protected List<Shop> shopList;
    protected List<Product> productList;
    protected List<Article> articleList;
    protected List<Offer> offerList;
    protected List<Discount> discountList;
    protected List<Tax> taxList;



    public ProductConfigBasicRQ() {
    }

    public ProductConfigBasicRQ(Integer shopId, List<Shop> shopList, List<Product> productList, List<Article> articleList, List<Offer> offerList, List<Discount> discountList, List<Tax> taxList) {
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
        if(this.productList == null){
            setProductList(new ArrayList<>());
        }
        this.productList.add(product);
    }

    public void addArticle(Article article){
        if(this.articleList == null){
            this.articleList = new ArrayList<>();
        }
        this.articleList.add(article);
    }

    public void addOffer(Offer offer){
        if(this.offerList == null){
            this.offerList = new ArrayList<>();
        }
        this.offerList.add(offer);
    }

    public void addShop(Shop shop){
        if(this.shopList == null){
            setShopList(new ArrayList<>());
        }
        this.shopList.add(shop);
    }

    public void addDiscount(Discount discount){
        if(this.discountList == null){
            this.discountList = new ArrayList<>();
        }
        this.discountList.add(discount);
    }

    public void addTax(Tax tax){
        if(this.taxList == null){
            this.taxList = new ArrayList<>();
        }
        this.taxList.add(tax);
    }



    @Override
    public String toString() {

        String shopListString = "{ ";
        if(getShopList() != null){
            for(Shop shop : getShopList()){
                shopListString += shop.toString();
                shopListString += ", ";
            }
        }
        shopListString += " }";

        String productListString = "{ ";
        if(getProductList() != null){
            for(Product product : getProductList()){
                productListString += product.toString();
                productListString += ", ";
            }
        }
        productListString += " }";

        String articleListString = "{ ";
        if(getArticleList() != null){
            for(Article article : getArticleList()){
                articleListString += article.toString();
                articleListString += ", ";
            }
        }
        articleListString += " }";

        String offerListString = "{ ";
        if(getOfferList() != null){
            for(Offer offer : getOfferList()){
                offerListString += offer.toString();
                offerListString += ", ";
            }
        }
        offerListString += " }";
        
        String discountListString = "{ ";
        if(getDiscountList() != null){
            for(Discount discount : getDiscountList()){
                discountListString += discount.toString();
                discountListString += ", ";
            }
        }
        discountListString += " }";
        
        String taxListString = "{ ";
        if(getTaxList() != null){
            for(Tax tax : getTaxList()){
                taxListString += tax.toString();
                taxListString += ", ";
            }
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
