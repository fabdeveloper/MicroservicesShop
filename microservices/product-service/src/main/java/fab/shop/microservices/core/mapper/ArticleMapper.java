package fab.shop.microservices.core.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.product.Article;
import fab.shop.microservices.core.product.persistence.ArticleEntity;



@Mapper(componentModel = "spring", uses = { ProductMapper.class})
public interface ArticleMapper {


    public Article entityToApi(ArticleEntity articleEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public ArticleEntity apiToEntity(Article article);
    
}
