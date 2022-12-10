package fab.shop.api.exceptions;

import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;

public class ProductPurchaseConfirmException extends RuntimeException {

    private ProductPurchaseConfirmRS productPurchaseConfirmRS;

	public ProductPurchaseConfirmException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductPurchaseConfirmException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ProductPurchaseConfirmException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ProductPurchaseConfirmException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ProductPurchaseConfirmException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}






    public ProductPurchaseConfirmRS getProductPurchaseConfirmRS() {
        return this.productPurchaseConfirmRS;
    }

    public void setProductPurchaseConfirmRS(ProductPurchaseConfirmRS productPurchaseConfirmRS) {
        this.productPurchaseConfirmRS = productPurchaseConfirmRS;
    }

    
}
