package fab.shop.api.core.product.msg;

import java.util.Objects;

public class GenericProductConfigRQ {
    private String info;



    public GenericProductConfigRQ() {
    }

    public GenericProductConfigRQ(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public GenericProductConfigRQ info(String info) {
        setInfo(info);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GenericProductConfigRQ)) {
            return false;
        }
        GenericProductConfigRQ genericProductConfigRQ = (GenericProductConfigRQ) o;
        return Objects.equals(info, genericProductConfigRQ.info);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(info);
    }

    @Override
    public String toString() {
        return "{" +
            " info='" + getInfo() + "'" +
            "}";
    }



    
    

    
}
