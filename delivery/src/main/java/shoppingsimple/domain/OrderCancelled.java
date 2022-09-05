package shoppingsimple.domain;

import shoppingsimple.domain.*;
import shoppingsimple.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;

// keep

}


