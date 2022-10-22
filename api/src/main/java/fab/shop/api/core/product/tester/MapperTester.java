package fab.shop.api.core.product.tester;

import org.springframework.web.bind.annotation.GetMapping;


public interface MapperTester {
    
    @GetMapping(
        value = "/product/maptester/shop/apiobject",
        produces = "application/json")
      String getShopApiObject();


    @GetMapping(
        value = "/product/maptester/shop/entityobject",
        produces = "application/json")
      String getShopEntityObject();

    @GetMapping(
        value = "/product/maptester/product/apiobject",
        produces = "application/json")
      String getProductApiObject();


    @GetMapping(
        value = "/product/maptester/product/entityobject",
        produces = "application/json")
      String getProductEntityObject();


    @GetMapping(
        value = "/product/maptester/article/apiobject",
        produces = "application/json")
      String getArticleApiObject();


    @GetMapping(
        value = "/product/maptester/article/entityobject",
        produces = "application/json")
      String getArticleEntityObject();

    @GetMapping(
        value = "/product/maptester/offer/apiobject",
        produces = "application/json")
      String getOfferApiObject();


    @GetMapping(
        value = "/product/maptester/offer/entityobject",
        produces = "application/json")
      String getOfferEntityObject();

    @GetMapping(
        value = "/product/maptester/discount/apiobject",
        produces = "application/json")
      String getDiscountApiObject();


    @GetMapping(
        value = "/product/maptester/discount/entityobject",
        produces = "application/json")
      String getDiscountEntityObject();

    @GetMapping(
        value = "/product/maptester/tax/apiobject",
        produces = "application/json")
      String getTaxApiObject();


    @GetMapping(
        value = "/product/maptester/tax/entityobject",
        produces = "application/json")
      String getTaxEntityObject();



}
