package fab.shop.microservices.core.product.persistence;



import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface OfferPurchaseRepository  extends CrudRepository<OfferPurchaseEntity, Integer> {

    
    @Transactional
    public Optional<OfferPurchaseEntity> findById(Integer offerPurchaseId);



    @Transactional
    @Query("select x from OfferPurchaseEntity x where x.book.id = :bookId")
    public List<OfferPurchaseEntity> findByBookId(@Param("bookId") Integer bookId);

    
}
