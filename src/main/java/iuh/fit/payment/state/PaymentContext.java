package iuh.fit.payment.state;

public class PaymentContext {
	private PaymentState state;

	public PaymentContext(PaymentState state) {
		this.state = state;
	}

	public void setState(PaymentState state) {
		this.state = state;
	}

	public void process() {
		state.handle(this);
	}

	public String getStateName() {
		return state.getName();
	}
}
