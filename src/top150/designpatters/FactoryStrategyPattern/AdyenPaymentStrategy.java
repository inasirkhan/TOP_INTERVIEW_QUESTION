package top150.designpatters.FactoryStrategyPattern;

public class AdyenPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Adyen");
    }

    @Override
    public String getName() {
        return "ADYEN";
    }
}
