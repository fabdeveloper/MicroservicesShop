package fab.shop.microservices.core.purchase.mapper;



import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.api.core.purchase.transfer.CartItem;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;
import fab.shop.microservices.core.purchase.persistence.CartItemEntity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartItemMapperTest {

    private CartItemMapper mapper = Mappers.getMapper(CartItemMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        CartItem apiObject = new 
        CartItemEntity entity = mapper.apiToEntity(apiObject);

        assertEqualsApiEntity(apiObject, entity);
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        CartItemEntity entity = new CartItemEntity(1, 0, null, 2, null, null, null, null);
        CartItem apiObject = mapper.entityToApi(entity);

        assertEqualsApiEntity(apiObject, entity);
    }

    private void assertEqualsApiEntity(CartItem apiObject, CartItemEntity entity){

        assertEquals(apiObject.getProductBookingNumber(), entity.getProductBookingNumber());
        assertEquals(apiObject.getValuation(), entity.getValuation());



    }






    
}
