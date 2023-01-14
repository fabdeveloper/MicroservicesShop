package fab.shop.microservices.core.purchase.mapper;



import java.util.ArrayList;
import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.api.core.purchase.transfer.CartItem;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;
import fab.shop.microservices.core.purchase.persistence.CartItemEntity;


@Mapper(componentModel = "spring")
public interface CartItemMapper {

    public CartItem entityToApi(CartItemEntity entityObject);


    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public CartItemEntity apiToEntity(CartItem apiObject);



    
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
