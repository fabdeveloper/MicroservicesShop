package fab.shop.api.core.product.transfer;


public class Article extends AbstractBusinessItem {

    private Product product;


    public Article(Integer id, String name, String description, String remarks, Product product) {
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

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "Article : { " + super.toString() +         
            ", product='" + getProduct().toString() + "'" +
            " }";
    }

    

}
