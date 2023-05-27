package fab.shop.microservices.core.purchase.mapper;

import org.mapstruct.factory.Mappers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

// import org.mapstruct.ap.testutil.*;
// import com.bluegosling.apt.testing.*;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.api.core.purchase.transfer.CartItem;
import fab.shop.microservices.core.purchase.mapper.CartDetailMapper;
import fab.shop.microservices.core.purchase.mapper.CartItemMapper;

import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;
import fab.shop.microservices.core.purchase.persistence.CartItemEntity;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


// @WithClasses({  
//     CartItemMapper.class })
//   @RunWith(@RunWith(AnnotationProcessorTestRunner.class).class)
public class CartDetailMapperTest {

    private CartDetailMapper mapper = Mappers.getMapper(CartDetailMapper.class);

    @Mock CartDetailMapper cartDetailMapper;


    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // @Test
    public void apiToEntityTest(){
        assertNotNull(mapper);

        CartItem item = new CartItem(1, 1, 2, 1, "offer name", "offer description", 9.9f);
        List<CartItem> itemList = new ArrayList<>();
        itemList.add(item);
        CartDetail apiObject = new CartDetail(null, itemList, 9.9f, 5, 1);
        // CartDetailEntity entity = mapper.apiToEntity(apiObject);
        CartDetailEntity entity = CartDetailMapper.INSTANCE.apiToEntity(apiObject);

        assertEqualsApiEntity(apiObject, entity);
    }

    // @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        List<CartItemEntity> itemList = new ArrayList<>();


        CartDetailEntity entity = new CartDetailEntity(1, 0, null, 9.00f, 5, 1);

        CartItemEntity item = new CartItemEntity(1, 0, entity, 2, 1, "offer name", "offer description", 9.9f);
        itemList.add(item);
        entity.setItemsList(itemList);
        
        // CartDetail apiObject = mapper.entityToApi(entity);
        CartDetail apiObject = CartDetailMapper.INSTANCE.entityToApi(entity);

        assertEqualsApiEntity(apiObject, entity);
    }

    private void assertEqualsApiEntity(CartDetail apiObject, CartDetailEntity entity){

        assertEquals(apiObject.getProductBookingNumber(), entity.getProductBookingNumber());
        assertEquals(apiObject.getValuation(), entity.getValuation());



    }


    
}
