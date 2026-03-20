package iuh.fit.payment.decorator;

import iuh.fit.payment.strategy.PaymentStrategy;

public class FeeDecorator extends PaymentDecorator {
	private final double fee;

	public FeeDecorator(PaymentStrategy decoratedPayment) {
		this(decoratedPayment, 5.0);
	}

	public FeeDecorator(PaymentStrategy decoratedPayment, double fee) {
		super(decoratedPayment);
		this.fee = fee;
	}

	@Override
	public void pay(double amount) {
		double total = amount + fee;
		System.out.println("+ Phí xử lý: " + fee);
		decoratedPayment.pay(total);
	}
}
