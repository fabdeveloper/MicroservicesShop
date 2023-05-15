package fab.shop.api.core.product.exception;

import fab.shop.api.core.product.msg.ProductServiceErrorListRS;
import java.util.Objects;

public class ProductServiceException extends Exception{

    private ProductServiceErrorListRS rs;



    public ProductServiceException() {
    }

    
    public ProductServiceException(ProductServiceErrorListRS rs) {
        this.rs = rs;
    }
    
    

    /**
     * @return ProductServiceErrorListRS return the rs
     */
    public ProductServiceErrorListRS getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ProductServiceErrorListRS rs) {
        this.rs = rs;
    }

}
