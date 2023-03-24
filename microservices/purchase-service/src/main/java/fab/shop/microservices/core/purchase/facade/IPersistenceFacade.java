package fab.shop.microservices.core.purchase.facade;

import fab.shop.microservices.core.purchase.mapper.IPurchaseServiceGeneralMapper;
import fab.shop.microservices.core.purchase.repository.IPurchaseServiceGeneralRepository;

public interface IPersistenceFacade {

    public IPurchaseServiceGeneralRepository getRepository();
    public IPurchaseServiceGeneralMapper getMapper();
    
}
