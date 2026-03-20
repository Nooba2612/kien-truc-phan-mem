package iuh.fit.factory;

import iuh.fit.payment.strategy.PaymentStrategy;
import iuh.fit.payment.strategy.CreditCardPayment;
import iuh.fit.tax.strategy.LuxuryTax;
import iuh.fit.tax.strategy.TaxStrategy;

public class LuxuryOrderFactory implements AbstractOrderFactory {
	@Override
	public PaymentStrategy createPaymentStrategy() {
		// Ví dụ: hàng xa xỉ vẫn thanh toán bằng thẻ
		return new CreditCardPayment();
	}

	@Override
	public TaxStrategy createTaxStrategy() {
		return new LuxuryTax();
	}
}
