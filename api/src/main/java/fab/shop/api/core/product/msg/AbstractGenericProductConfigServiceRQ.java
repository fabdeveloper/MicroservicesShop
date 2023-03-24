package fab.shop.api.core.product.msg;

import java.util.Objects;

public abstract class AbstractGenericProductConfigServiceRQ {
    
    private String info;


    public AbstractGenericProductConfigServiceRQ() {
    }

    public AbstractGenericProductConfigServiceRQ(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public AbstractGenericProductConfigServiceRQ info(String info) {
        setInfo(info);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AbstractGenericProductConfigServiceRQ)) {
            return false;
        }
        AbstractGenericProductConfigServiceRQ abstractGenericProductConfigServiceRQ = (AbstractGenericProductConfigServiceRQ) o;
        return Objects.equals(info, abstractGenericProductConfigServiceRQ.info);
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
