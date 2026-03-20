package iuh.fit.payment.strategy;

public class CreditCardPayment implements PaymentStrategy {
	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng");
	}
}
