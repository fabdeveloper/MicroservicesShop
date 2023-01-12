package fab.shop.microservices.core.purchase.mapper;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.UserDetail;
import fab.shop.microservices.core.purchase.persistence.UserDetailEntity;

public class UserDetailMapperTest {

    private DeliveryDetailMapper mapper = Mappers.getMapper(DeliveryDetailMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        UserDetail apiObject = new UserDetail(1, 1, 1, "user@email.com", "555-55-5555");
        UserDetailEntity entity = mapper.apiToEntity(apiObject);

        assertEqualsApiEntity(apiObject, entity);
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        UserDetailEntity entity = new UserDetailEntity(1, 0, 1, 1, "user@email.com", "555-55-5555");
        UserDetail apiObject = mapper.entityToApi(entity);

        assertEqualsApiEntity(apiObject, entity);
    }

    private void assertEqualsApiEntity(UserDetail apiObject, UserDetailEntity entityObject){
        assertEquals(apiObject.getEmail(), entityObject.getEmail());
        assertEquals(apiObject.getPhoneNumber(), entityObject.getPhoneNumber());



    }

 
    
}
