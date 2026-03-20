package iuh.fit.order.state;

import iuh.fit.order.context.OrderContext;

public class ProcessingState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Đóng gói và vận chuyển");
        context.setState(new DeliveredState());
    }
}
