package shoppingsimple.external;

import lombok.Data;
import java.util.Date;
@Data
public class Order {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;
    private String address;

    // keep

}


