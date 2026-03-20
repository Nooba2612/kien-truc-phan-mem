package iuh.fit.tax.decorator;

import iuh.fit.tax.strategy.TaxStrategy;

public abstract class TaxDecorator implements TaxStrategy {
	protected TaxStrategy tax;

	public TaxDecorator(TaxStrategy tax) {
		this.tax = tax;
	}
}