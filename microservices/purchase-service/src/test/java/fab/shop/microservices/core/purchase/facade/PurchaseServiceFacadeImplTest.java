package fab.shop.microservices.core.purchase.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import fab.shop.api.core.purchase.msg.GetPurchaseListRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseListRS;
import fab.shop.api.core.purchase.msg.GetPurchaseRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseRS;
import fab.shop.api.core.purchase.msg.PurchaseCancelRQ;
import fab.shop.api.core.purchase.msg.PurchaseCancelRS;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRQ;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;
import fab.shop.api.core.purchase.msg.PurchaseModificationRQ;
import fab.shop.api.core.purchase.msg.PurchaseModificationRS;

public class PurchaseServiceFacadeImplTest {

    private PurchaseServiceFacadeImpl service;

    @BeforeEach
    public void init(){


        
    }

    @Test
    public void purchaseModificationTest(){
    // public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {


        assertEquals("EQUAL - ", "EQUAL - ");

    }

    @Test
    public void purchaseCancelTest(){
        // public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {



            assertNull(null);
    }
    
    @Test
    public void getPurchaseTest(){
        // public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {


            assertTrue(true);
    }

    @Test
    public void getPurchaseListTest(){
        // public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {

            assertFalse(false);
    }

    @Test
    public void purchaseConfirmTest(){
        // public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {

            assertTrue(true);
    }

    
}
