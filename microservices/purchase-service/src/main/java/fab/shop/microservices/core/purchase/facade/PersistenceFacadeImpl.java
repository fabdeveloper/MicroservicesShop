package fab.shop.microservices.core.purchase.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.microservices.core.purchase.mapper.IPurchaseServiceGeneralMapper;
import fab.shop.microservices.core.purchase.repository.IPurchaseServiceGeneralRepository;


@Component
public class PersistenceFacadeImpl implements IPersistenceFacade {

    @Autowired
    private IPurchaseServiceGeneralRepository repository;

    @Autowired
    private IPurchaseServiceGeneralMapper mapper;





    @Override
    public IPurchaseServiceGeneralRepository getRepository() {
        return this.repository;
    }

    @Override
    public IPurchaseServiceGeneralMapper getMapper() {
        return this.mapper;
    }
    
}
