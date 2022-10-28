package fab.shop.api.core.product.msg;

import java.util.List;
import java.util.Objects;

import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;

public abstract class AbstractListProduct {

        private List<Product> productList;
        private List<Article> articleList;
        private List<Offer> offerList;



    public AbstractListProduct(List<Product> productList, List<Article> articleList, List<Offer> offerList) {
        this.productList = productList;
        this.articleList = articleList;
        this.offerList = offerList;
    }


    public AbstractListProduct() {
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

    public AbstractListProduct productList(List<Product> productList) {
        setProductList(productList);
        return this;
    }

    public AbstractListProduct articleList(List<Article> articleList) {
        setArticleList(articleList);
        return this;
    }

    public AbstractListProduct offerList(List<Offer> offerList) {
        setOfferList(offerList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AbstractListProduct)) {
            return false;
        }
        AbstractListProduct abstractListProduct = (AbstractListProduct) o;
        return Objects.equals(productList, abstractListProduct.productList) && Objects.equals(articleList, abstractListProduct.articleList) && Objects.equals(offerList, abstractListProduct.offerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList, articleList, offerList);
    }

    @Override
    public String toString() {
        return "{" +
            " productList='" + getProductList() + "'" +
            ", articleList='" + getArticleList() + "'" +
            ", offerList='" + getOfferList() + "'" +
            "}";
    }

    
}
