package fab.shop.microservices.core.purchase.persistence;





import java.util.Objects;

import javax.persistence.*;



@Entity
@Table(name="users")
public class UserDetailEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;

    private Integer userId;
    private Integer shopId;
    private String email;
    private String phoneNumber;



    public UserDetailEntity() {
    }

    public UserDetailEntity(Integer id, Integer version, Integer userId, Integer shopId, String email, String phoneNumber) {
        this.id = id;
        this.version = version;
        this.userId = userId;
        this.shopId = shopId;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserDetailEntity id(Integer id) {
        setId(id);
        return this;
    }

    public UserDetailEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public UserDetailEntity userId(Integer userId) {
        setUserId(userId);
        return this;
    }

    public UserDetailEntity shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public UserDetailEntity email(String email) {
        setEmail(email);
        return this;
    }

    public UserDetailEntity phoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserDetailEntity)) {
            return false;
        }
        UserDetailEntity userDetailEntity = (UserDetailEntity) o;
        return Objects.equals(id, userDetailEntity.id) && Objects.equals(version, userDetailEntity.version) && Objects.equals(userId, userDetailEntity.userId) && Objects.equals(shopId, userDetailEntity.shopId) && Objects.equals(email, userDetailEntity.email) && Objects.equals(phoneNumber, userDetailEntity.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, userId, shopId, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", userId='" + getUserId() + "'" +
            ", shopId='" + getShopId() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            "}";
    }

    
    

    
}
