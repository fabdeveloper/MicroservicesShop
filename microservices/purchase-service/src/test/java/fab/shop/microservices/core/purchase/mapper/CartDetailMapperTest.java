package fab.shop.microservices.core.purchase.mapper;

import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.api.core.purchase.transfer.CartItem;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CartDetailMapperTest {

    private CartDetailMapper mapper = Mappers.getMapper(CartDetailMapper.class);


    @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        CartItem item = new CartItem(1, 1, 2, 1, "offer name", "offer description", 9.9f);
        List<CartItem> itemList = new ArrayList<>();
        itemList.add(item);
        CartDetail apiObject = new CartDetail(1, itemList, 9.9f, 5);
        CartDetailEntity entity = mapper.apiToEntity(apiObject);

        assertEqualsApiEntity(apiObject, entity);
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        CartDetailEntity entity = new CartDetailEntity(null, null, null, null, null);
        CartDetail apiObject = mapper.entityToApi(entity);

        assertEqualsApiEntity(apiObject, entity);
    }

    private void assertEqualsApiEntity(CartDetail apiObject, CartDetailEntity entity){

        assertEquals(apiObject.getProductBookingNumber(), entity.getProductBookingNumber());
        assertEquals(apiObject.getValuation(), entity.getValuation());



    }


    
}
