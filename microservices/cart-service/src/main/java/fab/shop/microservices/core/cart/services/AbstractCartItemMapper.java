package fab.shop.microservices.core.cart.services;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import fab.shop.api.core.cart.CartItem;
import fab.shop.microservices.core.cart.persistence.CartItemEntity;


@Mapper(componentModel = "spring")
public abstract class AbstractCartItemMapper implements CartItemMapper {


    @Override
    public List<CartItem> entityListToApiList(List<CartItemEntity> entityList){
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

    @Override
    public List<CartItemEntity> apiListToEntityList(List<CartItem> apiList){
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
