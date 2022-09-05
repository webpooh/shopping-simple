package shoppingsimple.domain;

import shoppingsimple.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private String deliveryStatus;
}
