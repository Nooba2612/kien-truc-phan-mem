package iuh.fit.tax.strategy;

public class VATTax implements TaxStrategy {
	@Override
	public double calculate(double price) {
		// Thuế VAT 10%
		return price * 0.1;
	}
}
