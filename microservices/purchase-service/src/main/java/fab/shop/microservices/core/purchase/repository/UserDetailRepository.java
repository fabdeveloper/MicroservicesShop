package fab.shop.microservices.core.purchase.repository;

import fab.shop.microservices.core.purchase.persistence.UserDetailEntity;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface UserDetailRepository extends CrudRepository<UserDetailEntity, Integer> {
    
    public Optional<UserDetailEntity> findById(Integer userDetailId);
    
}
