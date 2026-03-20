package iuh.fit.factory;

import iuh.fit.payment.strategy.PaypalPayment;
import iuh.fit.payment.strategy.PaymentStrategy;

public class PaypalPaymentFactory implements PaymentFactory {
	@Override
	public PaymentStrategy createPayment() {
		return new PaypalPayment();
	}
}
