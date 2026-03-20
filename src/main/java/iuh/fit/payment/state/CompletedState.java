package iuh.fit.payment.state;

public class CompletedState implements PaymentState {
	@Override
	public void handle(PaymentContext context) {
		System.out.println("Trạng thái thanh toán: Đã hoàn tất");
	}

	@Override
	public String getName() {
		return "COMPLETED";
	}
}
