package fab.shop.microservices.core.purchase.mapper;



import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.mapstruct.factory.Mappers;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit.jupiter.SpringExtension;

import fab.shop.api.core.purchase.transfer.Purchase;
import fab.shop.microservices.core.purchase.persistence.PurchaseEntity;


public class PurchaseMapperTest {


    private PurchaseMapper mapper = Mappers.getMapper(PurchaseMapper.class);


    // @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        Purchase apiObject = new Purchase(null, new Date(), null, "purchase remarks", null, null, null, null);
        PurchaseEntity entity = mapper.apiToEntity(apiObject);

        assertEqualsApiEntity(apiObject, entity);
    }

    // @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        PurchaseEntity entity = new PurchaseEntity(1, 0, new Date(), null, "purchase remarks", null, null, null, null);
        Purchase apiObject = mapper.entityToApi(entity);

        assertEqualsApiEntity(apiObject, entity);
    }

    private void assertEqualsApiEntity(Purchase apiObject, PurchaseEntity entityObject){
        assertEquals(apiObject.getConfirmationDate(), entityObject.getConfirmationDate());
        assertEquals(apiObject.getRemarks(), entityObject.getRemarks());



    }

 



    
}
