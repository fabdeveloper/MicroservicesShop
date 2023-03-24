package fab.shop.api.core.product.msg;

import java.util.List;

public class ProductCreateNewRS extends AbstractProductConfigRS {

    public ProductCreateNewRS() {
        super();
    }


    public ProductCreateNewRS(List<String> errorList) {
        super(errorList);
    }

}
