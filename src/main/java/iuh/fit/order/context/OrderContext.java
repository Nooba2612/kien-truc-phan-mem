package iuh.fit.order.context;

import iuh.fit.order.state.OrderState;
import iuh.fit.order.state.CancelledState;

public class OrderContext {
    private OrderState state;

    public OrderContext(OrderState state) {
        this.state = state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }

    public void cancel() {
        this.state = new CancelledState();
        state.handle(this);
    }
}