package fab.shop.microservices.core.product.persistence;

import javax.persistence.*;


@Entity
@Table(name = "ARTICLES")
public class ArticleEntity extends AbstractBusinessEntityItem {

    private ProductEntity product;


    public ArticleEntity() {
        super();
    }

    public ArticleEntity(Integer id, Integer version, String name, String description, String remarks, ProductEntity product) {
        super(id, version, name, description, remarks);
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
        return anterior +  ", {" +
            " product='" + getProduct().toString() + "'" +
            "}";
    }


    


    
    
}
