package fab.shop.microservices.core.mapper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import fab.shop.api.core.product.Shop;
import fab.shop.microservices.core.product.persistence.ShopEntity;

import fab.shop.microservices.core.mapper.ShopMapper;
import org.mapstruct.factory.Mappers;



public class ShopMapperTests {
    
    private ShopMapper mapper = Mappers.getMapper(ShopMapper.class);

    @Test
    public void mapperTest(){

        assertNotNull(mapper);

        Shop apiObject = new Shop(null, "shop2 name", "shop2 description", "shop2 remarks", 33335);

        
        ShopEntity entityObject = mapper.apiToEntity(apiObject);

        assertEquals(apiObject.getName(), entityObject.getName());
        assertEquals(apiObject.getDescription(), entityObject.getDescription());
        assertEquals(apiObject.getRemarks(), entityObject.getRemarks());

        Shop apiObject2 = mapper.entityToApi(entityObject);

        assertEquals(apiObject.getName(), apiObject2.getName());
        assertEquals(apiObject.getDescription(), apiObject2.getDescription());
        assertEquals(apiObject.getRemarks(), apiObject2.getRemarks());

    }
}
