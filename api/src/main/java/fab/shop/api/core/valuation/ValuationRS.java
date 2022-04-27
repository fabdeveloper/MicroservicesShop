package fab.shop.api.core.valuation;

import java.util.List;

import fab.shop.api.core.product.Product;

public class ValuationRS {

    private final Integer itemsCount;
    private final Float total;
    private final List<Product> productList;
    private final String serviceAddress;




    public ValuationRS(Integer itemsCount, Float total, List<Product> productList, String serviceAddress) {
        this.itemsCount = itemsCount;
        this.total = total;
        this.productList = productList;
        this.serviceAddress = serviceAddress;
    }




    public ValuationRS() {
        this.itemsCount = 0;
        this.total = 0.0f;
        this.productList = null;
        this.serviceAddress = null;
    }



    public Integer getItemsCount() {
        return this.itemsCount;
    }


    public Float getTotal() {
        return this.total;
    }


    public List<Product> getProductList() {
        return this.productList;
    }



    public String getServiceAddress() {
        return this.serviceAddress;
    }




    
}
