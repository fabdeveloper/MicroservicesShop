package fab.shop.microservices.core.purchase.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.api.core.purchase.msg.GetPurchaseListRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseListRS;
import fab.shop.api.core.purchase.msg.GetPurchaseRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseRS;
import fab.shop.api.core.purchase.msg.PurchaseCancelRQ;
import fab.shop.api.core.purchase.msg.PurchaseCancelRS;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRQ;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;
import fab.shop.api.core.purchase.msg.PurchaseModificationRQ;
import fab.shop.api.core.purchase.msg.PurchaseModificationRS;


@Component
public class PurchaseServiceFacadeImpl implements IPurchaseServiceFacade {

    @Autowired
    private IPersistenceFacade persistenceFacade;




    public IPersistenceFacade getPersistenceFacade() {
        return this.persistenceFacade;
    }

    public void setPersistenceFacade(IPersistenceFacade persistenceFacade) {
        this.persistenceFacade = persistenceFacade;
    }




    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
