package fab.shop.microservices.core.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.product.transfer.Discount;
import fab.shop.microservices.core.product.persistence.DiscountEntity;


@Mapper(componentModel = "spring")
public interface DiscountMapper {


    public Discount entityToApi(DiscountEntity discountEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public DiscountEntity apiToEntity(Discount discount);


    default List<Discount> entityListToApiList(List<DiscountEntity> entityList){
        List<Discount> discountList = null;
        Discount item = null;
        if(entityList != null){
            discountList = new ArrayList<Discount>();
            for(DiscountEntity entity : entityList){
                item = this.entityToApi(entity);
                discountList.add(item);
            }
        }
        return discountList;
    }


    default List<DiscountEntity> apiListToEntityList(List<Discount> apiList){
        List<DiscountEntity> eList = null;
        DiscountEntity entity = null;
        if(apiList != null){
            eList = new ArrayList<DiscountEntity>();

            for(Discount item : apiList){
                entity = this.apiToEntity(item);
                eList.add(entity);
            }
        }
        return eList;
    }

    
}
