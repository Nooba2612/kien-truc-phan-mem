package iuh.fit.factory;

import iuh.fit.payment.strategy.PaymentStrategy;
import iuh.fit.payment.strategy.CreditCardPayment;
import iuh.fit.tax.strategy.TaxStrategy;
import iuh.fit.tax.strategy.VATTax;

public class NormalOrderFactory implements AbstractOrderFactory {
	@Override
	public PaymentStrategy createPaymentStrategy() {
		return new CreditCardPayment();
	}

	@Override
	public TaxStrategy createTaxStrategy() {
		return new VATTax();
	}
}
