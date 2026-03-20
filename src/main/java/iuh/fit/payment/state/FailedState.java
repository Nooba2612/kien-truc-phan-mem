package iuh.fit.payment.state;

public class FailedState implements PaymentState {
	@Override
	public void handle(PaymentContext context) {
		System.out.println("Trạng thái thanh toán: Thất bại");
	}

	@Override
	public String getName() {
		return "FAILED";
	}
}
