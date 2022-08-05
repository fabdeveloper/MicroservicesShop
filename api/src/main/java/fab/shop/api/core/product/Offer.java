package fab.shop.api.core.product;

public class Offer extends AbstractBusinessItem{

    private final Float price;
    private final Article article;

    public Offer() {
        super();

        this.price = null;
        this.article = null;
    }



    public Offer(int id, String name, String description, String remarks, Product product, Float price, Article article) {
        super(id, name, description, remarks);
        this.price = price;
        this.article = article;
    }


    public Float getPrice() {
        return this.price;
    }


    public Article getArticle() {
        return this.article;
    }


    @Override
    public String toString() {
        return "{" + super.toString() +
            ", price='" + getPrice() + "'" +
            ", article='" + getArticle() + "'" +
            "}";
    }




    
}
