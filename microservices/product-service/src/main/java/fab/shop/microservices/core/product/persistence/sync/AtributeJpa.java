package fab.shop.microservices.core.product.persistence.sync;

public class AtributeJpa {
    
    private Integer id;
    private String name;
    private String value;
    private Integer articleId;


    public AtributeJpa() {
    }


    public AtributeJpa(Integer id, String name, String value, Integer articleId) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.articleId = articleId;
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

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

}
