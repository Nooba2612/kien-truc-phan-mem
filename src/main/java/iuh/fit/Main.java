package iuh.fit;

import iuh.fit.factory.AbstractOrderFactory;
import iuh.fit.factory.LuxuryOrderFactory;
import iuh.fit.factory.NormalOrderFactory;
import iuh.fit.order.context.OrderContext;
import iuh.fit.order.decorator.BasicOrderService;
import iuh.fit.order.decorator.LoggingDecorator;
import iuh.fit.order.decorator.OrderService;
import iuh.fit.order.state.NewState;
import iuh.fit.order.strategy.FastShipping;
import iuh.fit.order.strategy.NormalShipping;
import iuh.fit.payment.decorator.DiscountDecorator;
import iuh.fit.payment.decorator.FeeDecorator;
import iuh.fit.payment.state.PaymentContext;
import iuh.fit.payment.state.PendingState;
import iuh.fit.payment.strategy.PaymentStrategy;
import iuh.fit.tax.decorator.ExtraTax;
import iuh.fit.tax.state.NormalProduct;
import iuh.fit.tax.state.ProductState;
import iuh.fit.tax.state.TaxFreeProduct;
import iuh.fit.tax.strategy.TaxStrategy;
import iuh.fit.util.AppLogger;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== ORDER: State + Strategy + Decorator =====");
        OrderContext order = new OrderContext(new NewState());
        order.process();
        order.process(); 
        order.cancel(); 

        OrderService normalOrder = new LoggingDecorator(
                new BasicOrderService(new NormalShipping()));
        normalOrder.placeOrder(500_000);

        OrderService fastOrder = new LoggingDecorator(
                new BasicOrderService(new FastShipping()));
        fastOrder.placeOrder(800_000);

        System.out.println("\n===== PAYMENT: Strategy + Decorator + State =====");
        AbstractOrderFactory normalFactory = new NormalOrderFactory();
        PaymentStrategy basePayment = normalFactory.createPaymentStrategy();
        PaymentStrategy payment = new DiscountDecorator(new FeeDecorator(basePayment));
        payment.pay(1_000_000);

        PaymentContext paymentContext = new PaymentContext(new PendingState());
        System.out.println("Trạng thái hiện tại: " + paymentContext.getStateName());
        paymentContext.process(); 
        System.out.println("Trạng thái sau khi xử lý: " + paymentContext.getStateName());

        System.out.println("\n===== TAX: Strategy + Decorator + State =====");
        ProductState normalProduct = new NormalProduct();
        ProductState taxFreeProduct = new TaxFreeProduct();

        TaxStrategy normalTax = new ExtraTax(normalProduct.getTaxStrategy());
        double tax1 = normalTax.calculate(2_000_000);
        System.out.println(normalProduct.getDescription() + ", thuế phải trả: " + tax1);

        TaxStrategy taxFree = taxFreeProduct.getTaxStrategy();
        double tax2 = taxFree.calculate(2_000_000);
        System.out.println(taxFreeProduct.getDescription() + ", thuế phải trả: " + tax2);

        AppLogger.getInstance().log("Kết thúc mô phỏng các Design Pattern");
    }
}