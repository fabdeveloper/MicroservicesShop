package fab.shop.microservices.core.cart.services;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import fab.shop.api.core.cart.CartItem;
import fab.shop.microservices.core.cart.persistence.CartItemEntity;

@Mapper(componentModel = "spring")
public interface CartItemMapper {

    public CartItem entityToApi(CartItemEntity cartItemEntity);

    @Mappings({
        @Mapping(target = "version", ignore = true),
        @Mapping(target = "creationDate", ignore = true),
        @Mapping(target = "modificationDate", ignore = true)

    })
    public CartItemEntity apiToEntity(CartItem cartItem);



    default List<CartItem> entityListToApiList(List<CartItemEntity> entityList){

        List<CartItem> cartItemsList = null;
        CartItem item = null;
        if(entityList != null){
            cartItemsList = new ArrayList<CartItem>();

            for(CartItemEntity entity : entityList){
                item = this.entityToApi(entity);
                cartItemsList.add(item);
            }
        }
        return cartItemsList;
    }


    default List<CartItemEntity> apiListToEntityList(List<CartItem> apiList){

        List<CartItemEntity> cartItemEntitiesList = null;
        CartItemEntity entity = null;

        if(apiList != null){
            cartItemEntitiesList = new ArrayList<CartItemEntity>();

            for(CartItem item : apiList){
                entity = this.apiToEntity(item);
                cartItemEntitiesList.add(entity);
            }
        }
        return cartItemEntitiesList;

    }
    
}
