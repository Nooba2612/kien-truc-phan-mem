package iuh.fit.order.state;

import iuh.fit.order.context.OrderContext;

public interface OrderState {
    void handle(OrderContext context);
}

