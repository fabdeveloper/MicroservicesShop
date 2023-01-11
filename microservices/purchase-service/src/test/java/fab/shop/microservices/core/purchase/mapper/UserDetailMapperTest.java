package fab.shop.microservices.core.purchase.mapper;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.UserDetail;
import fab.shop.microservices.core.purchase.persistence.UserDetailEntity;

public class UserDetailMapperTest {

    private UserDetail apiObject;
    private UserDetailEntity entityObject;

    private DeliveryDetailMapper mapper = Mappers.getMapper(DeliveryDetailMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        UserDetail apiObject = new UserDetail(1, 1, 1, "user@email.com", "555-55-5555");
        UserDetailEntity entity = mapper.apiToEntity(apiObject);

        assertEquals(apiObject.getEmail(), entity.getEmail());
        assertEquals(apiObject.getPhoneNumber(), entity.getPhoneNumber());
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        UserDetailEntity entity = new UserDetailEntity(1, 0, 1, 1, "user@email.com", "555-55-5555");
        UserDetail apiObject = mapper.entityToApi(entity);

        assertEquals(apiObject.getEmail(), entity.getEmail());
        assertEquals(apiObject.getPhoneNumber(), entity.getPhoneNumber());
    }

 
    
}
