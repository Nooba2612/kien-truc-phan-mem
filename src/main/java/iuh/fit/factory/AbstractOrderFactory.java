package iuh.fit.factory;

import iuh.fit.payment.strategy.PaymentStrategy;
import iuh.fit.tax.strategy.TaxStrategy;

public interface AbstractOrderFactory {
	PaymentStrategy createPaymentStrategy();
	TaxStrategy createTaxStrategy();
}
