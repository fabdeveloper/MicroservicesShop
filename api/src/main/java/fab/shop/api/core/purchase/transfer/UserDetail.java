package fab.shop.api.core.purchase.transfer;

import java.util.Objects;
import javax.validation.constraints.NotNull;


public class UserDetail {
    

    
    private Integer id;



    @NotNull
    private Integer userId;
    @NotNull
    private Integer shopId;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;



    public UserDetail() {
    }

    public UserDetail(Integer id, Integer userId, Integer shopId, String email, String phoneNumber) {
        this.id = id;
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

    public UserDetail id(Integer id) {
        setId(id);
        return this;
    }

    public UserDetail userId(Integer userId) {
        setUserId(userId);
        return this;
    }

    public UserDetail shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public UserDetail email(String email) {
        setEmail(email);
        return this;
    }

    public UserDetail phoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserDetail)) {
            return false;
        }
        UserDetail userDetail = (UserDetail) o;
        return Objects.equals(id, userDetail.id) && Objects.equals(userId, userDetail.userId) && Objects.equals(shopId, userDetail.shopId) && Objects.equals(email, userDetail.email) && Objects.equals(phoneNumber, userDetail.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, shopId, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", shopId='" + getShopId() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            "}";
    }

}
