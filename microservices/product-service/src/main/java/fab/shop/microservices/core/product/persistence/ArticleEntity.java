package fab.shop.microservices.core.product.persistence;

import java.util.Objects;

import javax.persistence.*;



@Entity
@Table(name = "ARTICLES")
public class ArticleEntity extends BusinessEntity {    

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity product;


    public ArticleEntity() {
        super();
    }

    public ArticleEntity(Integer id, Integer version, String name, String description, String remarks, ProductEntity product) {
        super(id, version, name, description, remarks);

        this.product = product;
    }

    

    public ArticleEntity(ProductEntity product) {
        this.product = product;
    }

    public ProductEntity getProduct() {
        return this.product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public ArticleEntity product(ProductEntity product) {
        setProduct(product);
        return this;
    }


    

    @Override
    public String toString() {
        String anterior = super.toString();
        String productString = (getProduct() != null ? getProduct().toString() : "null");

        return "{ " + anterior + 
            ", product='" + productString  + "'" +
            " }";
    }


    
    
}
