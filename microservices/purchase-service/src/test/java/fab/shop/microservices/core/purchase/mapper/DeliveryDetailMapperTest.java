package fab.shop.microservices.core.purchase.mapper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.DeliveryDetail;
import fab.shop.microservices.core.purchase.persistence.DeliveryDetailEntity;



public class DeliveryDetailMapperTest {

    private DeliveryDetailMapper mapper = Mappers.getMapper(DeliveryDetailMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        DeliveryDetail apiObject = new DeliveryDetail(1, "customer name", "delivery address", "phone number", "delivery remarks", "delivery status", new Date());
        DeliveryDetailEntity entity = mapper.apiToEntity(apiObject);

        assertEquals(apiObject.getCustomerName(), entity.getCustomerName());
        assertEquals(apiObject.getDeliveryAddress(), entity.getDeliveryAddress());
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        DeliveryDetailEntity entity = new DeliveryDetailEntity(1, 1,"customer name", "delivery address", "phone number", "delivery remarks", "delivery status", new Date());
        DeliveryDetail apiObject = mapper.entityToApi(entity);

        assertEquals(apiObject.getCustomerName(), entity.getCustomerName());
        assertEquals(apiObject.getDeliveryAddress(), entity.getDeliveryAddress());
    }



    
}
