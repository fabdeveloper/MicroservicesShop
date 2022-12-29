package fab.shop.microservices.core.mapper;


import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.product.msg.OfferPurchase;
import fab.shop.microservices.core.product.persistence.OfferPurchaseEntity;



@Mapper(componentModel = "spring")
public interface OfferPurchaseMapper {

    public OfferPurchase entityToApi(OfferPurchaseEntity entityObject);


    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "version", ignore = true),
        @Mapping(target = "book", ignore = true)
    })
    public OfferPurchaseEntity apiToEntity(OfferPurchase apiObject);


    public default List<OfferPurchaseEntity> apiListToEntityList(List<OfferPurchase> apiObjectList){
        List<OfferPurchaseEntity> entityList = new ArrayList<>();

        OfferPurchaseEntity entity;
        for(OfferPurchase apiObject : apiObjectList){
            entity = apiToEntity(apiObject);
            entityList.add(entity);
        }
        return entityList;
    }
    
}
