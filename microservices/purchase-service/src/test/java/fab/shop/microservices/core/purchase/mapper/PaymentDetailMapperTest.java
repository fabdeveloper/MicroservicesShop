package fab.shop.microservices.core.purchase.mapper;


import org.mapstruct.factory.Mappers;

import fab.shop.api.core.purchase.transfer.PaymentDetail;
import fab.shop.api.core.purchase.transfer.PaymentStatusTypeEnum;
import fab.shop.microservices.core.purchase.persistence.PaymentDetailEntity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class PaymentDetailMapperTest {

    private PaymentDetailMapper mapper = Mappers.getMapper(PaymentDetailMapper.class);


    @Test   
    public void apiToEntityTest(){
        assertNotNull(mapper);

        PaymentDetail apiObject = new PaymentDetail(1, PaymentStatusTypeEnum.PAYED, null, new Date(), null);
        PaymentDetailEntity entity = mapper.apiToEntity(apiObject);

        assertEqualsApiEntity(apiObject, entity);
    }

    @Test
    public void entityToApiTest(){
        assertNotNull(mapper);

        PaymentDetailEntity entity = new PaymentDetailEntity(null, null, null, null, null, null);
        PaymentDetail apiObject = mapper.entityToApi(entity);

        assertEqualsApiEntity(apiObject, entity);

    }

    private void assertEqualsApiEntity(PaymentDetail apiObject, PaymentDetailEntity entity){

        assertEquals(apiObject.getPaymentDate(), entity.getPaymentDate());
        assertEquals(apiObject.getPaymentStatus(), entity.getPaymentStatus());



    }




    
}
