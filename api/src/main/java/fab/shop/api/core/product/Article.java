package fab.shop.api.core.product;

import java.util.Objects;

public class Article extends Product {
    private final int id;
    private final String name;
    private final String description;
    private final String remarks;
    private final Product product;


    public Article(int id, String name, String description, String remarks, Product product) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.remarks = remarks;
        this.product = product;
    }


    public Article() {
        this.id = 0;
        this.name = null;
        this.description = null;
        this.remarks = null;
        this.product = null;
    }



    public int getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public String getDescription() {
        return this.description;
    }


    public String getRemarks() {
        return this.remarks;
    }


    public Product getProduct() {
        return this.product;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Article)) {
            return false;
        }
        Article article = (Article) o;
        return id == article.id && Objects.equals(name, article.name) && Objects.equals(description, article.description) && Objects.equals(remarks, article.remarks) && Objects.equals(product, article.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, remarks, product);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }






    

}
