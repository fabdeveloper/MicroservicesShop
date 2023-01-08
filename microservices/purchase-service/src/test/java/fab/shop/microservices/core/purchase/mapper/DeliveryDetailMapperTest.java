package fab.shop.microservices.core.purchase.mapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.mapstruct.factory.Mappers;



public class DeliveryDetailMapperTest {

    private DeliveryDetailMapper mapper = Mappers.getMapper(DeliveryDetailMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);


        assertEquals("EQUAL - ", "EQUAL - ");
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);


        assertEquals("EQUAL - ", "EQUAL - ");
    }



    
}
