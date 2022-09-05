package shoppingsimple.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import shoppingsimple.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shoppingsimple.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired DeliveryRepository deliveryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @Autowired
    shoppingsimple.external.OrderService orderService;

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_StartDelivery(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener StartDelivery : " + orderPlaced + "\n\n");

        // REST Request Sample
        
        // orderService.getOrder(/** mapping value needed */);


        

        // Sample Logic //
        Delivery.startDelivery(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCancelled'")
    public void wheneverOrderCancelled_DeleteDelivery(@Payload OrderCancelled orderCancelled){

        OrderCancelled event = orderCancelled;
        System.out.println("\n\n##### listener DeleteDelivery : " + orderCancelled + "\n\n");


        

        // Sample Logic //
        Delivery.deleteDelivery(event);
        

        

    }

    // keep

}


