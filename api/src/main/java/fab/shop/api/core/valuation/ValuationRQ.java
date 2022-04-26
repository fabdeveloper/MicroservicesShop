package fab.shop.api.core.valuation;

import java.util.List;

import fab.shop.api.core.product.Product;

public class ValuationRQ {

    private final List<Product> productList;
    private final List<String> discountCodeList;


    public ValuationRQ(List<Product> productList, List<String> discountCodeList) {
        this.productList = productList;
        this.discountCodeList = discountCodeList;
    }

    public ValuationRQ() {
        this.productList = null;
        this.discountCodeList = null;
    }



    public List<Product> getProductList() {
        return this.productList;
    }


    public List<String> getDiscountCodeList() {
        return this.discountCodeList;
    }



    
}
