package fab.shop.microservices.core.product.persistence;




import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "purchase_items")
public class OfferPurchaseEntity {


    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private ProductBookingEntity book;    

    private Integer offerId;
    private Integer count;


    public OfferPurchaseEntity() {
    }

    public OfferPurchaseEntity(Integer id, Integer version, ProductBookingEntity book, Integer offerId, Integer count) {
        this.id = id;
        this.version = version;
        this.book = book;
        this.offerId = offerId;
        this.count = count;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ProductBookingEntity getBook() {
        return this.book;
    }

    public void setBook(ProductBookingEntity book) {
        this.book = book;
    }

    public Integer getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public OfferPurchaseEntity id(Integer id) {
        setId(id);
        return this;
    }

    public OfferPurchaseEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public OfferPurchaseEntity book(ProductBookingEntity book) {
        setBook(book);
        return this;
    }

    public OfferPurchaseEntity offerId(Integer offerId) {
        setOfferId(offerId);
        return this;
    }

    public OfferPurchaseEntity count(Integer count) {
        setCount(count);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OfferPurchaseEntity)) {
            return false;
        }
        OfferPurchaseEntity offerPurchaseEntity = (OfferPurchaseEntity) o;
        return Objects.equals(id, offerPurchaseEntity.id) && Objects.equals(version, offerPurchaseEntity.version) && Objects.equals(book, offerPurchaseEntity.book) && Objects.equals(offerId, offerPurchaseEntity.offerId) && Objects.equals(count, offerPurchaseEntity.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, book, offerId, count);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", book='" + getBook() + "'" +
            ", offerId='" + getOfferId() + "'" +
            ", count='" + getCount() + "'" +
            "}";
    }

    
}
