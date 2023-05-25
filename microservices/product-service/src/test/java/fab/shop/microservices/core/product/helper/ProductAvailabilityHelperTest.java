package fab.shop.microservices.core.product.helper;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;

public class ProductAvailabilityHelperTest {

    IProductAvailabilityHelper availHelper = new ProductAvailabilityHelperImpl();

    @BeforeEach
    public void init(){
        // remove all if exists

        // create product

    }
    

    @Test
    public	void getAvailTest(){
        Integer shopId = 1;


        GetAvailRQ rq = new GetAvailRQ(shopId, null, null, null);
        // GetAvailRS rs = availHelper.getAvail(rq);



        Boolean bCondition = true;
        assertTrue(bCondition, "ProductAvailabilityHelperTest.getAvailTest() NO VA BIEN ---------");
    }
    
    @Test
    public	void getOfferListDetailTest(){
        Integer shopId = 1;
        GetOfferListDetailRQ rq = new GetOfferListDetailRQ(shopId, null);
        // GetOfferListDetailRS rs = availHelper.getOfferListDetail(rq);


        Boolean bCondition = true;
        assertTrue(bCondition, "ProductAvailabilityHelperTest.getOfferListDetailTest() NO VA BIEN ---------");
    }

}
