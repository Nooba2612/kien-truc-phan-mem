package iuh.fit.tax.state;

import iuh.fit.tax.strategy.TaxStrategy;
import iuh.fit.tax.strategy.VATTax;

public class NormalProduct implements ProductState {
	@Override
	public TaxStrategy getTaxStrategy() {
		return new VATTax();
	}

	@Override
	public String getDescription() {
		return "Sản phẩm chịu thuế VAT";
	}
}
