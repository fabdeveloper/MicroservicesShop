package fab.shop.microservices.core.purchase.mapper;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.Purchase;
import fab.shop.microservices.core.purchase.persistence.PurchaseEntity;

public class PurchaseMapperTest {


    private PurchaseMapper mapper = Mappers.getMapper(PurchaseMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        Purchase apiObject = new Purchase(1, 1, 1, "user@email.com", "555-55-5555");
        PurchaseEntity entity = mapper.apiToEntity(apiObject);

        assertEqualsApiEntity(apiObject, entity);
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        PurchaseEntity entity = new UserDetailEntity(1, 0, 1, 1, "user@email.com", "555-55-5555");
        Purchase apiObject = mapper.entityToApi(entity);

        assertEqualsApiEntity(apiObject, entity);
    }

    private void assertEqualsApiEntity(Purchase apiObject, PurchaseEntity entityObject){
        assertEquals(apiObject.getEmail(), entityObject.getEmail());
        assertEquals(apiObject.getPhoneNumber(), entityObject.getPhoneNumber());



    }

 



    
}
