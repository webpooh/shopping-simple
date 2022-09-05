package shoppingsimple.domain;

import shoppingsimple.domain.*;
import shoppingsimple.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private String deliveryStatus;

    public DeliveryStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
    // keep

}
