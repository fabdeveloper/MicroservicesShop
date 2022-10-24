package fab.shop.microservices.core.mapper;

import fab.shop.api.core.product.Shop;
import fab.shop.api.core.product.tester.MapperTester;
import fab.shop.microservices.core.product.persistence.ShopEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MapperTesterImpl implements MapperTester {

    @Autowired
    private ProductServiceGeneralMapper mapper;
    

    public ProductServiceGeneralMapper getMapper() {
        return this.mapper;
    }

    public void setMapper(ProductServiceGeneralMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public String getShopApiObject() {
        String result = "NO_INICIALIZADO";
        // List<Integer> adminList = new ArrayList<Integer>();
        // adminList.add(33);        adminList.add(99);
        ShopEntity entity = new ShopEntity(66, null, "my shop", "my shop description", "my shop remarks", 2);
        Shop shop = getMapper().getShopMapper().entityToApi(entity);

        if(shop != null){
            result = shop.toString();
        }
        return result;
    }

    @Override
    public String getShopEntityObject() {
        String result = "NO_INICIALIZADO";
        List<Integer> adminList = new ArrayList<Integer>();
        adminList.add(3);        adminList.add(9);
        Shop shop = new Shop(6, "shop name", "shop description", "shop remarks", 1);
        ShopEntity entity = getMapper().getShopMapper().apiToEntity(shop);

        if(entity != null){
            result = entity.toString();
        }
        return result;
    }

    @Override
    public String getProductApiObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getProductEntityObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getArticleApiObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getArticleEntityObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getOfferApiObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getOfferEntityObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDiscountApiObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDiscountEntityObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTaxApiObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTaxEntityObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTestAllMappersString() {
        String result = null;

        String shopApiObjectString = this.getShopApiObject();
        String shopEntityObjectString = this.getShopEntityObject();

        result = "shopApiObjectString : " + shopApiObjectString + ", ";
        result += "shopEntityObjectString : " + shopEntityObjectString + ", ";





        return result;
    }
    
}
