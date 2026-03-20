package iuh.fit.order.decorator;

import iuh.fit.order.strategy.ShippingStrategy;

public class BasicOrderService implements OrderService {
	private final ShippingStrategy shippingStrategy;

	public BasicOrderService(ShippingStrategy shippingStrategy) {
		this.shippingStrategy = shippingStrategy;
	}

	@Override
	public void placeOrder(double amount) {
		System.out.println("Tạo đơn hàng với giá trị: " + amount);
		shippingStrategy.ship();
	}
}
