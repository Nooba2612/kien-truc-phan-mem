package iuh.fit.tax.strategy;

public class LuxuryTax implements TaxStrategy {
	@Override
	public double calculate(double price) {
		// Thuế cao hơn cho hàng xa xỉ, ví dụ 20%
		return price * 0.2;
	}
}
