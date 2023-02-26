package fab.shop.microservices.composite.shop.services;

import org.springframework.beans.factory.annotation.Autowired;

import fab.shop.api.composite.IEShop;
import fab.shop.api.composite.IEShopOrquestrator;
import fab.shop.api.composite.msg.EShopProductConfirmRQ;
import fab.shop.api.composite.msg.EShopProductConfirmRS;
import fab.shop.api.composite.msg.EShopPurchaseConfirmRQ;
import fab.shop.api.composite.msg.EShopPurchaseConfirmRS;

public class EShopImpl implements IEShop{

    @Autowired
    private IEShopOrquestrator orquestrator;

    @Override
    public EShopProductConfirmRS eShopProductConfirm(EShopProductConfirmRQ eShopProductConfirmRQ) {
        return getOrquestrator().eShopProductConfirm(eShopProductConfirmRQ);
    }

    @Override
    public EShopPurchaseConfirmRS eShopPurchaseConfirm(EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ) {
        return getOrquestrator().eShopPurchaseConfirm(eShopPurchaseConfirmRQ);
    }


    public IEShopOrquestrator getOrquestrator() {
        return this.orquestrator;
    }

    public void setOrquestrator(IEShopOrquestrator orquestrator) {
        this.orquestrator = orquestrator;
    }



    
    
}
