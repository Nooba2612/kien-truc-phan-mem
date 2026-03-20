package iuh.fit.payment.state;

public class PendingState implements PaymentState {
	@Override
	public void handle(PaymentContext context) {
		System.out.println("Trạng thái thanh toán: Đang chờ xử lý");
		// Giả lập xử lý thành công để chuyển sang trạng thái hoàn tất
		context.setState(new CompletedState());
	}

	@Override
	public String getName() {
		return "PENDING";
	}
}
