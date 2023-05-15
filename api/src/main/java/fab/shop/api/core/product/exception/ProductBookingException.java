package fab.shop.api.core.product.exception;


import fab.shop.api.core.product.msg.ProductBookingRS;

public class ProductBookingException extends Exception implements IMsgResponse<ProductBookingRS> {


    private ProductBookingRS rs;

    @Override
    public ProductBookingRS getRS() {
        return this.rs;
    }

    @Override
    public void setRS(ProductBookingRS rs) {
        this.rs = rs;
    }
    
}
