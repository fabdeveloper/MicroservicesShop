package fab.shop.microservices.core.product.persistence.sync;

public class OfferJpa {
    
    private Integer id;
    private String name;
    private String description;
    private Float price;
    private Integer articleId;
    private String remarks;


    public OfferJpa() {
    }


    public OfferJpa(Integer id, String name, String description, Float price, Integer articleId, String remarks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.articleId = articleId;
        this.remarks = remarks;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
