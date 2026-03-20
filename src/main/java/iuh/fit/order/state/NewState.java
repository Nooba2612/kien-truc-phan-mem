package iuh.fit.order.state;

import iuh.fit.order.context.OrderContext;

public class NewState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Kiểm tra thông tin đơn hàng");
        context.setState(new ProcessingState());
    }
}
