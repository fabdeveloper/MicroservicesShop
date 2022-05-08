package fab.shop.microservices.core.users.persistence.sync;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "groups")
public class GroupJpa {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Version
    private int version;

    private String name;
    private List<RoleJpa> rolesList;


    public GroupJpa() {
    }


    public GroupJpa(Integer id, String name, List<RoleJpa> rolesList) {
        this.id = id;
        this.name = name;
        this.rolesList = rolesList;
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

    public List<RoleJpa> getRolesList() {
        return this.rolesList;
    }

    public void setRolesList(List<RoleJpa> rolesList) {
        this.rolesList = rolesList;
    }


}
