package iuh.fit.payment.strategy;

public class PaypalPayment implements PaymentStrategy {
	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán " + amount + " bằng PayPal");
	}
}
