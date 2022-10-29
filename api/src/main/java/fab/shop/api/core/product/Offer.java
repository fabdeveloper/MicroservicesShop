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

    

    public Offer() {
        super();

        this.price = null;
        this.article = null;
        this.discountList = null;
        this.taxList = null;
        this.dateFrom = null;
        this.dateTo = null;
        this.open = null;


    }

    public Offer(Integer id, String name, String description, String remarks, Float price, Article article, List<Discount> discountList, List<Tax> taxList, Date dateFrom, Date dateTo, Boolean open) {
        super(id, name, description, remarks);
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


    public Article getArticle() {
        return this.article;
    }


    public List<Discount> getDiscountList() {
        return this.discountList;
    }


    public List<Tax> getTaxList() {
        return this.taxList;
    }


    public Date getDateFrom() {
        return this.dateFrom;
    }


    public Date getDateTo() {
        return this.dateTo;
    }


    public Boolean isOpen() {
        return this.open;
    }

    public Boolean getOpen() {
        return this.open;
    }


    public void setPrice(Float price) {
        this.price = price;
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }
    public void setTaxList(List<Tax> taxList) {
        this.taxList = taxList;
    }
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
    public void setOpen(Boolean open) {
        this.open = open;
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
            ", dateFrom='" + getDateFrom().toString() + "'" +
            ", dateTo='" + getDateTo().toString() + "'" +
            ", open='" + isOpen() + "'" +
            " }";
    }


    
}
