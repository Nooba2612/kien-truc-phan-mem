package iuh.fit.payment.decorator;

import iuh.fit.payment.strategy.PaymentStrategy;

public class DiscountDecorator extends PaymentDecorator {
	private final double discountPercent;

	public DiscountDecorator(PaymentStrategy decoratedPayment) {
		this(decoratedPayment, 10.0);
	}

	public DiscountDecorator(PaymentStrategy decoratedPayment, double discountPercent) {
		super(decoratedPayment);
		this.discountPercent = discountPercent;
	}

	@Override
	public void pay(double amount) {
		double discounted = amount * (1 - discountPercent / 100.0);
		System.out.println("- Giảm giá " + discountPercent + "%: còn " + discounted);
		decoratedPayment.pay(discounted);
	}
}
