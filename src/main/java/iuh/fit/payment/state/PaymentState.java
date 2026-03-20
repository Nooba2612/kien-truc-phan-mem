package iuh.fit.payment.state;

public interface PaymentState {
	void handle(PaymentContext context);
	String getName();
}
