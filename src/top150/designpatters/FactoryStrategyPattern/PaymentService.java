package top150.designpatters.FactoryStrategyPattern;

public class PaymentService {

    public static void main(String[] args) {

        payAmount("visa", 120.50);
        payAmount("mastercard", 200.00);
        payAmount("unknown-method", 99.99); // will use Adyen (default)
    }

    public static void payAmount(String method, double amount) {
        PaymentStrategy strategy = PaymentStrategyFactory.getStrategy(method);
        strategy.pay(amount);
    }
}
