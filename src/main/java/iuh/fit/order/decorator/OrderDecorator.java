package iuh.fit.order.decorator;

public abstract class OrderDecorator implements OrderService {
	protected final OrderService decoratedOrderService;

	protected OrderDecorator(OrderService decoratedOrderService) {
		this.decoratedOrderService = decoratedOrderService;
	}

	@Override
	public void placeOrder(double amount) {
		decoratedOrderService.placeOrder(amount);
	}
}
