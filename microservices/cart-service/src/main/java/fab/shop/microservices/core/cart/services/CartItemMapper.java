package fab.shop.microservices.core.cart.services;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import fab.shop.api.core.cart.CartItem;
import fab.shop.microservices.core.cart.persistence.CartItemEntity;

@Mapper(componentModel = "spring")
public interface CartItemMapper {

    public CartItem entityToApi(CartItemEntity cartItemEntity);

    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public CartItemEntity apiToEntity(CartItem cartItem);
    
}
