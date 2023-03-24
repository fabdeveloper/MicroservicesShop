package fab.shop.microservices.core.purchase.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;
import fab.shop.microservices.core.purchase.persistence.CartItemEntity;


@Mapper(componentModel = "spring", uses = { CartItemMapper.class})
public interface CartDetailMapper {

    CartDetailMapper INSTANCE = Mappers.getMapper(CartDetailMapper.class);

    public CartDetail entityToApi(CartDetailEntity entityObject);


    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public CartDetailEntity apiToEntity(CartDetail apiObject);




    
    @AfterMapping
    default void setCartEntity(@MappingTarget CartDetailEntity cartEntity){
        for(CartItemEntity item : cartEntity.getItemsList()){
            item.setCart(cartEntity);
        }
    }
    
}
