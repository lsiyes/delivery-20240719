package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private Integer qty;
    private String customerId;
    private String address;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
