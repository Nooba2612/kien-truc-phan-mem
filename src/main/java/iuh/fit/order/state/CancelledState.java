package iuh.fit.order.state;

import iuh.fit.order.context.OrderContext;

public class CancelledState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Hủy đơn và hoàn tiền");
    }
}