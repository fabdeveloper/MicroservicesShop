package fab.shop.microservices.core.product.persistence;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "OFFERS")
public class OfferEntity extends AbstractBusinessEntityItem {

    private Float price;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private ArticleEntity article;

    private List<DiscountEntity> discountList;

    private List<TaxEntity> taxList;

    private Date dateFrom;
    private Date dateTo;
    private Boolean open;


    public OfferEntity() {
        super();
    }

    public OfferEntity(Integer id, Integer version, String name, String description, String remarks,
                            Float price, ArticleEntity article, List<DiscountEntity> discountList, List<TaxEntity> taxList, Date dateFrom, Date dateTo, Boolean open) {
        super(id, version, name, description, remarks);
        this.price = price;
        this.article = article;
        this.discountList = discountList;
        this.taxList = taxList;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.open = open;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public ArticleEntity getArticle() {
        return this.article;
    }

    public void setArticle(ArticleEntity article) {
        this.article = article;
    }

    public List<DiscountEntity> getDiscountList() {
        return this.discountList;
    }

    public void setDiscountList(List<DiscountEntity> discountList) {
        this.discountList = discountList;
    }

    public List<TaxEntity> getTaxList() {
        return this.taxList;
    }

    public void setTaxList(List<TaxEntity> taxList) {
        this.taxList = taxList;
    }

    public Date getDateFrom() {
        return this.dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return this.dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Boolean isOpen() {
        return this.open;
    }

    public Boolean getOpen() {
        return this.open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public OfferEntity price(Float price) {
        setPrice(price);
        return this;
    }

    public OfferEntity article(ArticleEntity article) {
        setArticle(article);
        return this;
    }

    public OfferEntity discountList(List<DiscountEntity> discountList) {
        setDiscountList(discountList);
        return this;
    }

    public OfferEntity taxList(List<TaxEntity> taxList) {
        setTaxList(taxList);
        return this;
    }

    public OfferEntity dateFrom(Date dateFrom) {
        setDateFrom(dateFrom);
        return this;
    }

    public OfferEntity dateTo(Date dateTo) {
        setDateTo(dateTo);
        return this;
    }

    public OfferEntity open(Boolean open) {
        setOpen(open);
        return this;
    }


    @Override
    public String toString() {
        String anterior = super.toString();
        String discountListString = "{ ";
        for(DiscountEntity discount : getDiscountList()){
            discountListString += discount.toString();
            discountListString += ", ";
        }
        discountListString += " }";

        String taxListString = "{ ";
        for(TaxEntity tax : getTaxList()){
            taxListString += tax.toString();
            taxListString += ", ";
        }
        taxListString += " }";

        return "{" + anterior + "'" +
            ", price='" + getPrice() + "'" +
            ", article='" + getArticle() + "'" +
            ", discountList='" + discountListString + "'" +
            ", taxList='" + taxListString + "'" +
            ", dateFrom='" + getDateFrom().toString() + "'" +
            ", dateTo='" + getDateTo().toString() + "'" +
            ", open='" + isOpen() + "'" +
            "}";
    }


    

    
    
}
