package fab.shop.microservices.core.mapper;

import fab.shop.api.core.product.Offer;
import fab.shop.microservices.core.product.persistence.OfferEntity;

import java.util.ArrayList;
import java.util.List;

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


    public default List<Offer> entityListToApiList(List<OfferEntity> entityList){

        List<Offer> apiList = new ArrayList<Offer>();
        for(OfferEntity entity : entityList){
            apiList.add(entityToApi(entity));
        }
        return apiList;        
    }
}
