package fab.shop.api.core.valuation.msg;

import java.util.List;

import fab.shop.api.core.product.Product;

public class ValuationRQ {
    private List<Product> productList;


    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}
