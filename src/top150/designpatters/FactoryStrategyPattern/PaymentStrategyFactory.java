package top150.designpatters.FactoryStrategyPattern;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategyFactory {

    private static final Map<PaymentMethodType, PaymentStrategy> strategies = new HashMap<>();

    static {
        strategies.put(PaymentMethodType.VISA, new VisaPaymentStrategy());
        strategies.put(PaymentMethodType.MASTERCARD, new MasterCardPaymentStrategy());
        strategies.put(PaymentMethodType.ADYEN, new AdyenPaymentStrategy());
    }

    public static PaymentStrategy getStrategy(String method) {

        PaymentMethodType type;

        try {
            type = PaymentMethodType.valueOf(method.toUpperCase());
        } catch (Exception e) {
            // default type
            type = PaymentMethodType.ADYEN;
        }

        return strategies.get(type);
    }
}
