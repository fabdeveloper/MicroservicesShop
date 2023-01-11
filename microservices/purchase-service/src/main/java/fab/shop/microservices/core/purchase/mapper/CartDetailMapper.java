package fab.shop.microservices.core.purchase.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;


@Mapper(componentModel = "spring")
public interface CartDetailMapper {

    public CartDetail entityToApi(CartDetailEntity entityObject);


    public CartDetailEntity apiToEntity(CartDetail apiObject);
    
}
