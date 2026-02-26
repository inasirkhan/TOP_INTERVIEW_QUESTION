package top150.deqode.intuit.day6;

import java.util.HashMap;
import java.util.Map;
interface PaymentStrategy{

    void getName();
    void pay();

}

class AdyenPaymentStrategy implements PaymentStrategy{

    @Override
    public void getName() {
        System.out.println("adyen");
    }

    @Override
    public void pay() {
        System.out.println("paying using adyen");
    }
}

class MasterPaymentStrategy implements PaymentStrategy{

    @Override
    public void getName() {
        System.out.println("master");
    }

    @Override
    public void pay() {
        System.out.println("paying using master");
    }
}

class PaymentStrategyFactory{

    private static Map<String, PaymentStrategy> map = new HashMap<>();

     static {
        map.put("adyen",new AdyenPaymentStrategy());
        map.put("master",new MasterPaymentStrategy());
    }

    public static PaymentStrategy getStrategy(String name){
        return map.get(name);
    }
}

public class StrategyPattern {

    public static void main(String[] args) {
        PaymentStrategy adyen = PaymentStrategyFactory.getStrategy("adyen");
        adyen.getName();
    }
}
