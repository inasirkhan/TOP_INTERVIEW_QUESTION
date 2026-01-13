package top150.designpatters.FactoryStrategyPattern;

public interface PaymentStrategy {
    void pay(double amount);
    String getName(); // must return VISA / MASTERCARD / ADYEN
}
