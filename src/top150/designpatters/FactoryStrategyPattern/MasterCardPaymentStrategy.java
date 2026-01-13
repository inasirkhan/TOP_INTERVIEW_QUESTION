package top150.designpatters.FactoryStrategyPattern;

public class MasterCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using MasterCard");
    }

    @Override
    public String getName() {
        return "MASTERCARD";
    }
}
