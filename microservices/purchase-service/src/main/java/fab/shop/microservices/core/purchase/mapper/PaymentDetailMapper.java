package fab.shop.microservices.core.purchase.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.purchase.transfer.PaymentDetail;
import fab.shop.microservices.core.purchase.persistence.PaymentDetailEntity;


@Mapper(componentModel = "spring")
public interface PaymentDetailMapper {

    public PaymentDetailEntity apiToEntity(PaymentDetail apiObject);


    public PaymentDetail entityToApi(PaymentDetailEntity entityObject);
    
}
