package fab.shop.api.core.product.exception;

public interface IMsgResponse<T> {

    public T getRS();
    public void setRS(T rs);    
}
