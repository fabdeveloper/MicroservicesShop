package fab.shop.microservices.core.purchase.mapper;

import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartDetailMapperTest {

    private CartDetailMapper mapper = Mappers.getMapper(CartDetailMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        CartDetail apiObject = new CartDetail(null, null, null, null);
        CartDetailEntity entity = mapper.apiToEntity(apiObject);

        assertEquals(apiObject.getProductBookingNumber(), entity.getProductBookingNumber());
        assertEquals(apiObject.getValuation(), entity.getValuation());
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        CartDetailEntity entity = new CartDetailEntity(null, null, null, null, null);
        CartDetail apiObject = mapper.entityToApi(entity);

        assertEquals(apiObject.getProductBookingNumber(), entity.getProductBookingNumber());
        assertEquals(apiObject.getValuation(), entity.getValuation());
    }


    
}
