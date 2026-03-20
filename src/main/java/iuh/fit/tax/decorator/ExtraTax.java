package iuh.fit.tax.decorator;

import iuh.fit.tax.strategy.TaxStrategy;

public class ExtraTax extends TaxDecorator {
    public ExtraTax(TaxStrategy tax) {
        super(tax);
    }

	@Override
	public double calculate(double price) {
		System.out.println("+ Phụ thu thuế cố định: 5");
		return tax.calculate(price) + 5;
	}
}