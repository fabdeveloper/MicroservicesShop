package fab.shop.api.core.product.msg;

import java.util.Objects;

public class ProductMappersTestRS {

    private String msg;


    public ProductMappersTestRS() {
    }

    public ProductMappersTestRS(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ProductMappersTestRS msg(String msg) {
        setMsg(msg);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductMappersTestRS)) {
            return false;
        }
        ProductMappersTestRS productMappersTestRS = (ProductMappersTestRS) o;
        return Objects.equals(msg, productMappersTestRS.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(msg);
    }

    @Override
    public String toString() {
        return "{" +
            " msg='" + getMsg() + "'" +
            "}";
    }

    
}
