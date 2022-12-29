package fab.shop.microservices.core.product.persistence;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.persistence.*;



@Entity
@Table(name = "product_bookings")
public class ProductBookingEntity {

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    private Integer shopId;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OfferPurchaseEntity> purchaseList;

    
    private Date creationDate;
	private Date modificationDate;



    public ProductBookingEntity() {
    }

    public ProductBookingEntity(Integer id, Integer version, Integer shopId, List<OfferPurchaseEntity> purchaseList, Date creationDate, Date modificationDate) {
        this.id = id;
        this.version = version;
        this.shopId = shopId;
        this.purchaseList = purchaseList;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
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

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public List<OfferPurchaseEntity> getPurchaseList() {
        return this.purchaseList;
    }

    public void setPurchaseList(List<OfferPurchaseEntity> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return this.modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public ProductBookingEntity id(Integer id) {
        setId(id);
        return this;
    }

    public ProductBookingEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public ProductBookingEntity shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductBookingEntity purchaseList(List<OfferPurchaseEntity> purchaseList) {
        setPurchaseList(purchaseList);
        return this;
    }

    public ProductBookingEntity creationDate(Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    public ProductBookingEntity modificationDate(Date modificationDate) {
        setModificationDate(modificationDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductBookingEntity)) {
            return false;
        }
        ProductBookingEntity productBookingEntity = (ProductBookingEntity) o;
        return Objects.equals(id, productBookingEntity.id) && Objects.equals(version, productBookingEntity.version) && Objects.equals(shopId, productBookingEntity.shopId) && Objects.equals(purchaseList, productBookingEntity.purchaseList) && Objects.equals(creationDate, productBookingEntity.creationDate) && Objects.equals(modificationDate, productBookingEntity.modificationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, shopId, purchaseList, creationDate, modificationDate);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", shopId='" + getShopId() + "'" +
            ", purchaseList='" + getPurchaseList() + "'" +
            ", creationDate='" + getCreationDate() + "'" +
            ", modificationDate='" + getModificationDate() + "'" +
            "}";
    }


    
}
