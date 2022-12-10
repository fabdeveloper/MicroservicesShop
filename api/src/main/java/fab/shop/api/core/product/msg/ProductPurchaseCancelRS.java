package fab.shop.api.core.product.msg;

import java.util.List;


public class ProductPurchaseCancelRS extends ProductPurchaseConfirmRS {



    public ProductPurchaseCancelRS() {
        super();
    }


    public ProductPurchaseCancelRS(Integer shopId, Boolean bConfirmed, Integer productBookingNumber, List<String> errorList) {
        super(shopId, bConfirmed, productBookingNumber, errorList);
    }

    
}
