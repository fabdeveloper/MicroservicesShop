package fab.shop.microservices.core.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.product.transfer.Shop;
import fab.shop.microservices.core.product.persistence.ShopEntity;

@Mapper(componentModel = "spring")
public interface ShopMapper {


    public Shop entityToApi(ShopEntity shopEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public ShopEntity apiToEntity(Shop shop);
    
}
