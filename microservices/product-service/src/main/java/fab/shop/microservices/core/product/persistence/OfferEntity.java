package fab.shop.microservices.core.product.persistence;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "offer")
public class OfferEntity extends BusinessEntity {

    private Float price;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private ArticleEntity article;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "offer_discount", joinColumns = @JoinColumn(name = "offer_id"), inverseJoinColumns = @JoinColumn(name = "discount_id"))
    private List<DiscountEntity> discountList;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "offer_tax", joinColumns = @JoinColumn(name = "offer_id"), inverseJoinColumns = @JoinColumn(name = "tax_id"))
    private List<TaxEntity> taxList;

    private Date dateFrom;
    private Date dateTo;
    private Boolean open;
    private Integer stockMax;
    private Integer availCount;




    public OfferEntity() {
        super();
    }


    public OfferEntity(Integer id, Integer version, String name, String description, String remarks,
                        Float price, ArticleEntity article, List<DiscountEntity> discountList, List<TaxEntity> taxList, 
                        Date dateFrom, Date dateTo, Boolean open, Integer stockMax, Integer availCount) { 
        super(id, version, name, description, remarks);
        this.price = price;
        this.article = article;
        this.discountList = discountList;
        this.taxList = taxList;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.open = open;
        this.stockMax = stockMax;
        this.availCount = availCount;
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

    public Integer getStockMax() {
        return this.stockMax;
    }

    public void setStockMax(Integer stockMax) {
        this.stockMax = stockMax;
    }

    public Integer getAvailCount() {
        return this.availCount;
    }

    public void setAvailCount(Integer availCount) {
        this.availCount = availCount;
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

    public OfferEntity stockMax(Integer stockMax) {
        setStockMax(stockMax);
        return this;
    }

    public OfferEntity availCount(Integer availCount) {
        setAvailCount(availCount);
        return this;
    }


    


    @Override
    public String toString() {
        String anterior = super.toString();
        String articleString = (getArticle() != null ? getArticle().toString() : "null");
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

        return anterior + ", {" +
            ", price='" + getPrice() + "'" +
            ", article='" + articleString + "'" +
            ", discountList='" + discountListString + "'" +
            ", taxList='" + taxListString + "'" +
            ", dateFrom='" + getDateFrom() + "'" +
            ", dateTo='" + getDateTo() + "'" +
            ", open='" + isOpen() + "'" +
            ", stockMax='" + getStockMax() + "'" +
            ", availCount='" + getAvailCount() + "'" +
                        "}";
    }

   
    
}
