package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private Integer qty;
    private String customerId;
    private String address;
}
