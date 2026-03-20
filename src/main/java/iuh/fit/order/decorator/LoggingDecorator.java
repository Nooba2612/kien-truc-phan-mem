package iuh.fit.order.decorator;

import iuh.fit.util.AppLogger;

public class LoggingDecorator extends OrderDecorator {
	public LoggingDecorator(OrderService decoratedOrderService) {
		super(decoratedOrderService);
	}

	@Override
	public void placeOrder(double amount) {
		AppLogger.getInstance().log("Bắt đầu xử lý đơn hàng");
		super.placeOrder(amount);
		AppLogger.getInstance().log("Kết thúc xử lý đơn hàng");
	}
}
