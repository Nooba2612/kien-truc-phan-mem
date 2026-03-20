package iuh.fit.tax.state;

import iuh.fit.tax.strategy.TaxStrategy;

public interface ProductState {
	TaxStrategy getTaxStrategy();
	String getDescription();
}
