package fab.shop.microservices.core.product.facade;

import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelper;

public interface PersistenceFacade {
    
    public ProductConfigPersistenceHelper getPersistenceHelper();

    public ProductServiceGeneralMapper getGeneralMapper();

    
}
