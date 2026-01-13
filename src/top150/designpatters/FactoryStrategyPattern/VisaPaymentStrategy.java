package top150.designpatters.FactoryStrategyPattern;

public class VisaPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Visa card");
    }

    @Override
    public String getName() {
        return "VISA";
    }
}
