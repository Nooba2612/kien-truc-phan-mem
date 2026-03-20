package iuh.fit.tax.state;

import iuh.fit.tax.strategy.TaxStrategy;

public class TaxFreeProduct implements ProductState {
	@Override
	public TaxStrategy getTaxStrategy() {
		// Sản phẩm không chịu thuế
		return price -> 0.0;
	}

	@Override
	public String getDescription() {
		return "Sản phẩm được miễn thuế";
	}
}
