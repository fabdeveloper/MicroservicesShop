package fab.shop.microservices.core.product.persistence.sync;

import java.util.List;

public class ArticleJpa {
    

    private Integer id;
    private String articleCode;
    private String name;

    private Integer productId;
    private String description;
    private String remarks;
    private List<AtributeJpa> atributeList;


    public ArticleJpa() {
    }


    public ArticleJpa(Integer id, String articleCode, String name, Integer productId, String description, String remarks, List<Atribute> atributeList) {
        this.id = id;
        this.articleCode = articleCode;
        this.name = name;
        this.productId = productId;
        this.description = description;
        this.remarks = remarks;
        this.atributeList = atributeList;
    }



    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleCode() {
        return this.articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public List<AtributeJpa> getAtributeList() {
        return this.atributeList;
    }

    public void setAtributeList(List<AtributeJpa> atributeList) {
        this.atributeList = atributeList;
    }



}
