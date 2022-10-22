package fab.shop.microservices.core.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.product.Product;
import fab.shop.microservices.core.product.persistence.ProductEntity;


@Mapper(componentModel = "spring", uses = { ShopMapper.class})
public interface ProductMapper {

    @Mappings({
        @Mapping(target = "serviceAddress", ignore = true)
    })
    public Product entityToApi(ProductEntity productEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public ProductEntity apiToEntity(Product product);
    
}
