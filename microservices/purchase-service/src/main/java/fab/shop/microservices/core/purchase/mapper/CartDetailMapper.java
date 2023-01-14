package fab.shop.microservices.core.purchase.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;


@Mapper(componentModel = "spring", uses = { CartItemMapper.class})
public interface CartDetailMapper {

    public CartDetail entityToApi(CartDetailEntity entityObject);


    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public CartDetailEntity apiToEntity(CartDetail apiObject);
    
}
