package iuh.fit.payment.decorator;

import iuh.fit.payment.strategy.PaymentStrategy;

public abstract class PaymentDecorator implements PaymentStrategy {
	protected final PaymentStrategy decoratedPayment;

	protected PaymentDecorator(PaymentStrategy decoratedPayment) {
		this.decoratedPayment = decoratedPayment;
	}

	@Override
	public void pay(double amount) {
		decoratedPayment.pay(amount);
	}
}
