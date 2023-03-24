package fab.shop.microservices.core.product.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelper;


@Component
public class PersistenceFacadeImpl implements IPersistenceFacade{

    @Autowired
    private ProductConfigPersistenceHelper persistenceHelper;

    @Autowired
    private ProductServiceGeneralMapper generalMapper;



    public PersistenceFacadeImpl() {
    }


    


    @Override
    public ProductConfigPersistenceHelper getPersistenceHelper() {
        return this.persistenceHelper;
    }

    @Override
    public ProductServiceGeneralMapper getGeneralMapper() {
        return this.generalMapper;
    }
    
}
