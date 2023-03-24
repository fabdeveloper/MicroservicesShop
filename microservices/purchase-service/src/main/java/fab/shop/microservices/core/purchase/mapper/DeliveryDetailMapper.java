package fab.shop.microservices.core.purchase.mapper;



import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.purchase.transfer.DeliveryDetail;
import fab.shop.microservices.core.purchase.persistence.DeliveryDetailEntity;



@Mapper(componentModel = "spring")
public interface DeliveryDetailMapper {


    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public DeliveryDetailEntity apiToEntity(DeliveryDetail apiObject);


    
    public DeliveryDetail entityToApi(DeliveryDetailEntity entityObject);
    
}
