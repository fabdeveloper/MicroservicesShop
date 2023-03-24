package fab.shop.microservices.core.purchase.mapper;



import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.purchase.transfer.Purchase;
import fab.shop.microservices.core.purchase.persistence.PurchaseEntity;


@Mapper(componentModel = "spring", uses = { UserDetailMapper.class, DeliveryDetailMapper.class, PaymentDetailMapper.class, CartDetailMapper.class})
public interface PurchaseMapper {

    public Purchase entityToApi(PurchaseEntity entityObject);

    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public PurchaseEntity apiToEntity(Purchase apiObject);



    
}
