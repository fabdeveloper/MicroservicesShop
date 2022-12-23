package fab.shop.microservices.core.mapper;

import fab.shop.microservices.core.mapper.ProductMapper;
import fab.shop.microservices.core.mapper.ShopMapper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.Shop;
import fab.shop.microservices.core.product.persistence.ProductEntity;
import fab.shop.microservices.core.product.persistence.ShopEntity;

// @ContextConfiguration(classes = {ProductMapperImpl.class, ShopMapperImpl.class})
@SpringBootTest(classes = {ProductMapperImpl.class, ShopMapperImpl.class})
public class ProductMapperTests {
    
    private ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    // @Test
    public void mapperTest(){

        assertNotNull(mapper);

        Shop shop = new Shop(null, "shop2 name", "shop2 description", "shop2 remarks", 33335);
        Product apiObject = new Product(null, "product 100 name", "product 100 description", "product 100 remarks", shop, "product 100 type", "service address");

        ProductEntity entityObject = mapper.apiToEntity(apiObject);

        assertEquals(apiObject.getName(), entityObject.getName());
        assertEquals(apiObject.getDescription(), entityObject.getDescription());
        assertEquals(apiObject.getRemarks(), entityObject.getRemarks());
        assertEquals(apiObject.getType(), entityObject.getType());

        Product apiObject2 = mapper.entityToApi(entityObject);

        assertEquals(apiObject.getName(), apiObject2.getName());
        assertEquals(apiObject.getDescription(), apiObject2.getDescription());
        assertEquals(apiObject.getRemarks(), apiObject2.getRemarks());
        assertEquals(apiObject.getType(), apiObject2.getType());

    }






}
