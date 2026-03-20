package iuh.fit.factory;

import iuh.fit.payment.strategy.PaymentStrategy;

public interface PaymentFactory {
	PaymentStrategy createPayment();
}
