package fab.shop.api.core.product;

import java.util.Date;
import java.util.List;

public class Offer extends AbstractBusinessItem{

    private Float price;
    private Article article;

    
    private List<Discount> discountList;
    private List<Tax> taxList;

    private Date dateFrom;
    private Date dateTo;
    private Boolean open;
    private Integer stockMax;
    private Integer availCount;
    


    public Offer() {
        super();
    }


    public Offer(Integer id, String name, String description, String remarks,
                    Float price, Article article, List<Discount> discountList, List<Tax> taxList, 
                    Date dateFrom, Date dateTo, Boolean open, Integer stockMax, Integer availCount) {
        super(id, name, description, remarks);
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

    public Article getArticle() {
        return this.article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public List<Discount> getDiscountList() {
        return this.discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public List<Tax> getTaxList() {
        return this.taxList;
    }

    public void setTaxList(List<Tax> taxList) {
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

    public Offer price(Float price) {
        setPrice(price);
        return this;
    }

    public Offer article(Article article) {
        setArticle(article);
        return this;
    }

    public Offer discountList(List<Discount> discountList) {
        setDiscountList(discountList);
        return this;
    }

    public Offer taxList(List<Tax> taxList) {
        setTaxList(taxList);
        return this;
    }

    public Offer dateFrom(Date dateFrom) {
        setDateFrom(dateFrom);
        return this;
    }

    public Offer dateTo(Date dateTo) {
        setDateTo(dateTo);
        return this;
    }

    public Offer open(Boolean open) {
        setOpen(open);
        return this;
    }

    public Offer stockMax(Integer stockMax) {
        setStockMax(stockMax);
        return this;
    }

    public Offer availCount(Integer availCount) {
        setAvailCount(availCount);
        return this;
    }




    @Override
    public String toString() {
        String anterior = super.toString();
        String discountListString = "{ ";
        for(Discount discount : getDiscountList()){
            discountListString += discount.toString();
            discountListString += ", ";
        }
        discountListString += " }";

        String taxListString = "{ ";
        for(Tax tax : getTaxList()){
            taxListString += tax.toString();
            taxListString += ", ";
        }
        taxListString += " }";

        return "Offer : { " + anterior + "'" +
            ", price='" + getPrice() + "'" +
            ", article='" + getArticle() + "'" +
            ", discountList='" + discountListString + "'" +
            ", taxList='" + taxListString + "'" +
            ", dateFrom='" + getDateFrom() + "'" +
            ", dateTo='" + getDateTo() + "'" +
            ", open='" + isOpen() + "'" +
            ", stockMax='" + getStockMax() + "'" +
            ", availCount='" + getAvailCount() + "'" +
                        " }";
    }


    
}
