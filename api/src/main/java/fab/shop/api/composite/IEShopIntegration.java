package fab.shop.api.composite;

import fab.shop.api.core.purchase.PurchaseService;
import fab.shop.api.core.valuation.ValuationService;
import fab.shop.api.core.product.ProductService;
import fab.shop.api.core.cart.CartService;


public interface IEShopIntegration extends CartService, ProductService, PurchaseService, ValuationService {
    
}
