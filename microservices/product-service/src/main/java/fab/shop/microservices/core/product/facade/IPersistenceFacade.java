package fab.shop.microservices.core.product.facade;

import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelper;

public interface IPersistenceFacade {
    
    public ProductConfigPersistenceHelper getPersistenceHelper();

    public ProductServiceGeneralMapper getGeneralMapper();

    
}
