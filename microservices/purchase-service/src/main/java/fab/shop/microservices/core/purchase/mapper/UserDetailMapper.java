package fab.shop.microservices.core.purchase.mapper;



import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import fab.shop.api.core.purchase.transfer.UserDetail;
import fab.shop.microservices.core.purchase.persistence.UserDetailEntity;



@Mapper(componentModel = "spring")
public interface UserDetailMapper {

    public UserDetail entityToApi(UserDetailEntity entityObject);


    public UserDetailEntity apiToEntity(UserDetail apiObject);
    
}
