package fab.shop.microservices.core.product.persistence;

import java.util.Objects;

import javax.persistence.*;



@Entity
@Table(name = "ARTICLES")
public class ArticleEntity extends AbstractBusinessEntityItem {

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity product;


    public ArticleEntity() {
        super();
    }

    public ArticleEntity(Integer id, Integer version, String name, String description, String remarks, ProductEntity product) {
        super(name, description, remarks);
        this.id = id;
        this.version = version;
        this.product = product;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

 

    public ArticleEntity(Integer id, Integer version, ProductEntity product) {
        this.id = id;
        this.version = version;
        this.product = product;
    }

    public ArticleEntity id(Integer id) {
        setId(id);
        return this;
    }

    public ArticleEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ArticleEntity)) {
            return false;
        }
        ArticleEntity articleEntity = (ArticleEntity) o;
        return Objects.equals(id, articleEntity.id) && Objects.equals(version, articleEntity.version) && Objects.equals(product, articleEntity.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, product);
    }


    @Override
    public String toString() {
        String anterior = super.toString();

        return anterior + ", {" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }


    


    
    
}
