package fab.shop.microservices.core.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.product.transfer.Article;
import fab.shop.microservices.core.product.persistence.ArticleEntity;



@Mapper(componentModel = "spring", uses = { ProductMapper.class})
public interface ArticleMapper {


    public Article entityToApi(ArticleEntity articleEntity);

    
    @Mappings({
        @Mapping(target = "version", ignore = true)
    })
    public ArticleEntity apiToEntity(Article article);


    public default List<Article> entityListToApiList(List<ArticleEntity> entityList){

        List<Article> apiList = new ArrayList<Article>();
        for(ArticleEntity entity : entityList){
            apiList.add(entityToApi(entity));
        }
        return apiList;        
    }
    
}
