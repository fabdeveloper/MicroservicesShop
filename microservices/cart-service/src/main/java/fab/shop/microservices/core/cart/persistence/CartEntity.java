package fab.shop.microservices.core.cart.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="carts")
public class CartEntity {
    

    @Id
    private String id;
    @Version
    private Integer version;


    @Indexed
    private int cartId;

    private List<ProductEntity> productList;


    public CartEntity() {
    }


    public CartEntity(String id, Integer version, int cartId, List<Product> productList) {
        this.id = id;
        this.version = version;
        this.cartId = cartId;
        this.productList = productList;
    }



    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public int getCartId() {
        return this.cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    
}
