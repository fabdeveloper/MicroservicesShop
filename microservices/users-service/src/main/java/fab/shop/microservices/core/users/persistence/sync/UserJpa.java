package fab.shop.microservices.core.users.persistence.sync;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;



@Entity
@Table(name = "users")
public class UserJpa {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Version
    private int version;

    private String name;
    private String password;
    private List<GroupJpa> groupList;


    public UserJpa() {
    }


    public UserJpa(Integer id, String name, String password, List<GroupJpa> groupList) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.groupList = groupList;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<GroupJpa> getGroupList() {
        return this.groupList;
    }

    public void setGroupList(List<GroupJpa> groupList) {
        this.groupList = groupList;
    }

    
}
