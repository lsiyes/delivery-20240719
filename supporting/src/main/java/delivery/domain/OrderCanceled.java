package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String productId;
    private String customerId;
    private Integer qty;
    private String address;
}
