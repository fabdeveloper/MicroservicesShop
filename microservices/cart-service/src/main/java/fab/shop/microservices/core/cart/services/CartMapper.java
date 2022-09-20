package fab.shop.microservices.core.cart.services;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import fab.shop.api.core.cart.Cart;
import fab.shop.microservices.core.cart.persistence.CartEntity;


@Mapper(componentModel = "spring", uses = { CartItemMapper.class})
public interface CartMapper {

    @Mappings({
        @Mapping(target = "serviceAddress", ignore = true),
        @Mapping(target = "cartItemsList", source = "itemsList")
    })
    public Cart entityToApi(CartEntity cartEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true),
        @Mapping(target = "itemsList", source = "cartItemsList"),
        @Mapping(target = "creationDate", ignore = true),
        @Mapping(target = "modificationDate", ignore = true)
    })
    public CartEntity apiToEntity(Cart cart);
}
