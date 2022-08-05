package fab.shop.microservices.core.product.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.ProductService;
import fab.shop.api.exceptions.InvalidInputException;
import fab.shop.api.exceptions.NotFoundException;


@RestController
public class ProductServiceImpl implements ProductService{

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ServiceUtil serviceUtil;


    @Autowired
    public ProductServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    @Override
    public Product getProduct(int productId) {
        LOG.debug("/product return the found product for productId={}", productId);

        if (productId < 1) {
          throw new InvalidInputException("Invalid productId: " + productId);
        }
    
        if (productId == 13) {
          throw new NotFoundException("No product found for productId: " + productId);
        }
        
        // return product_repository.findById(productId);

        
        // int id, String name, String description, String remarks, String type, String serviceAddress
        return new Product(productId, "product" + productId, "fake product", "fake product remarks", "fake product type", serviceUtil.getServiceAddress());
    }
    
}
