package fab.shop.microservices.core.purchase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;

import fab.shop.api.core.purchase.PurchaseService;
import fab.shop.api.core.purchase.msg.GetPurchaseListRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseListRS;
import fab.shop.api.core.purchase.msg.GetPurchaseRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseRS;
import fab.shop.api.core.purchase.msg.PurchaseCancelRQ;
import fab.shop.api.core.purchase.msg.PurchaseCancelRS;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;
import fab.shop.api.core.purchase.msg.PurchaseModificationRQ;
import fab.shop.api.core.purchase.msg.PurchaseModificationRS;
import fab.shop.api.core.purchase.transfer.PurchaseConfirmException;
import fab.shop.microservices.core.purchase.facade.IPurchaseServiceFacade;

@RestController
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private ServiceUtil serviceUtil;

    @Autowired
    private IPurchaseServiceFacade purchaseServiceFacade;



    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }

    public void setServiceUtil(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    public IPurchaseServiceFacade getPurchaseServiceFacade() {
        return this.purchaseServiceFacade;
    }

    public void setPurchaseServiceFacade(IPurchaseServiceFacade purchaseServiceFacade) {
        this.purchaseServiceFacade = purchaseServiceFacade;
    }




    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {
        return getPurchaseServiceFacade().purchaseModification(purchaseModificationRQ);
    }


    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        return getPurchaseServiceFacade().purchaseCancel(purchaseCancelRQ);
    }


    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        return getPurchaseServiceFacade().getPurchase(getPurchaseRQ);
    }


    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        return getPurchaseServiceFacade().getPurchaseList(getPurchaseListRQ);
    }


    @Override
    public PurchaseConfirmRS purchaseConfirm(fab.shop.api.core.purchase.msg.PurchaseConfirmRQ purchaseConfirmRQ) {
        PurchaseConfirmRS rs = new PurchaseConfirmRS();
        
        try {
            rs = getPurchaseServiceFacade().purchaseConfirm(purchaseConfirmRQ);
            
        } catch (PurchaseConfirmException e) {
            rs = e.getPurchaseConfirmRS();
            rs.addError("ERROR - msg= " + e.getMessage());
            rs.setStatus("NOT CONFIRMED");
        } catch(Throwable t){
            rs.addError("ERROR - msg= " + t.getMessage());
        }
        rs.addError("Received PurchaseConfirmRQ= " + purchaseConfirmRQ.toString());
        return rs;
    }
}
