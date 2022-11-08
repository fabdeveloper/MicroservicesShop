package fab.shop.api.composite;

import org.springframework.web.bind.annotation.GetMapping;

import fab.shop.api.core.product.msg.*;


public interface ShopIntegrationProductServiceTestHelper {
    
    
	@GetMapping(
                value = "/shoptester/productservice/testproductmappers",
                produces = "application/json")
        ProductMappersTestRS productMappersTestHelper();



        @GetMapping(
                value = "/shoptester/productservice/testgetavail",
                produces = "application/json")
                GetAvailRS getAvailTestHelper();


        @GetMapping(
                value = "/shoptester/productservice/testgetofferlistdetail",
                produces = "application/json")
                GetOfferListDetailRS getOfferListDetailTestHelper();


        @GetMapping(
                value = "/shoptester/productservice/testproductpurchaseconfirm",
                produces = "application/json")
                ProductPurchaseConfirmRS productPurchaseConfirmTestHelper();

                

        @GetMapping(
                value = "/shoptester/productservice/testproductpurchasecancel",
                produces = "application/json")
                ProductPurchaseCancelRS productPurchaseCancelTestHelper();


                
        @GetMapping(
                value = "/shoptester/productservice/testproductcreatenew",
                produces = "application/json")
                ProductCreateNewRS productCreateNewTestHelper();


        @GetMapping(
                value = "/shoptester/productservice/testconfig",
                produces = "application/json")
                ProductCreateNewRS productTestConfigTestHelper();



}

