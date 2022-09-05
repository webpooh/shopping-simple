package shoppingsimple.domain;

import shoppingsimple.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;
}
