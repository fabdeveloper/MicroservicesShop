package fab.shop.api.core.product;

import java.util.Objects;

public class Article extends AbstractBusinessItem {

    private final Product product;


    public Article(int id, String name, String description, String remarks, Product product) {
		super(id, name, description, remarks);

        this.product = product;
    }


    public Article() {
        super();

        this.product = null;
    }




    public Product getProduct() {
        return this.product;
    }



    @Override
    public String toString() {
        return "{" + super.toString() +         
            ", product='" + getProduct().toString() + "'" +
            "}";
    }

    

}
