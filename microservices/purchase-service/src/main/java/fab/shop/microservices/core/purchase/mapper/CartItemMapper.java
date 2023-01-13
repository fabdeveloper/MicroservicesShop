package fab.shop.microservices.core.purchase.mapper;



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


    public CartItemEntity apiToEntity(CartItem apiObject);



    
}
