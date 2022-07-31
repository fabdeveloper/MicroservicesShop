package fab.shop.api.core.valuation.msg;

import java.util.List;

import fab.shop.api.core.product.Product;

public class ValuationRS {

    private List<Product> productList;
    private Float valuation;



    public ValuationRS(List<Product> productList, Float valuation) {
        this.productList = productList;
        this.valuation = valuation;
    }


    public ValuationRS() {
        this.productList = null;
        this.valuation = 0.0f;
    }



    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }


    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
