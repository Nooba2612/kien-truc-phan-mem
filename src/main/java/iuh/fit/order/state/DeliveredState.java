package iuh.fit.order.state;

import iuh.fit.order.context.OrderContext;

public class DeliveredState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Đã giao hàng");
    }
}