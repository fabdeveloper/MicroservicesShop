package fab.shop.microservices.core.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.product.Tax;
import fab.shop.microservices.core.product.persistence.TaxEntity;


@Mapper(componentModel = "spring")
public interface TaxMapper {


    public Tax entityToApi(TaxEntity taxEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public TaxEntity apiToEntity(Tax tax);


    default List<Tax> entityListToApiList(List<TaxEntity> entityList){
        List<Tax> itemList = null;
        Tax item = null;
        if(entityList != null){
            itemList = new ArrayList<Tax>();
            for(TaxEntity entity : entityList){
                item = this.entityToApi(entity);
                itemList.add(item);
            }
        }
        return itemList;
    }


    default List<TaxEntity> apiListToEntityList(List<Tax> apiList){
        List<TaxEntity> eList = null;
        TaxEntity entity = null;
        if(apiList != null){
            eList = new ArrayList<TaxEntity>();

            for(Tax item : apiList){
                entity = this.apiToEntity(item);
                eList.add(entity);
            }
        }
        return eList;
    }
    
}
