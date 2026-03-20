package iuh.fit.factory;

import iuh.fit.payment.strategy.CreditCardPayment;
import iuh.fit.payment.strategy.PaymentStrategy;

public class CreditCardPaymentFactory implements PaymentFactory {
	@Override
	public PaymentStrategy createPayment() {
		return new CreditCardPayment();
	}
}
