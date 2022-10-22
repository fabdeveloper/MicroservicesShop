package fab.shop.microservices.core.mapper;

import fab.shop.api.core.product.Offer;
import fab.shop.microservices.core.product.persistence.OfferEntity;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring", uses = { ArticleMapper.class, DiscountMapper.class, TaxMapper.class})
public interface OfferMapper {
    

    public Offer entityToApi(OfferEntity offerEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public OfferEntity apiToEntity(Offer offer);
}
