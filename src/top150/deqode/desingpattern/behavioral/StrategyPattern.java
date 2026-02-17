package top150.deqode.desingpattern;


import java.util.HashMap;

interface PaymentStrategy{

    String getName();
    void Pay();
}

class AdyenStrategy implements PaymentStrategy{

    @Override
    public String getName() {
        return "adyen";
    }

    @Override
    public void Pay() {
        System.out.println("paying using adyen");
    }
}

class MasterCardStrategy implements PaymentStrategy{

    @Override
    public String getName() {
        return "master";
    }

    @Override
    public void Pay() {
        System.out.println("paying using master card");
    }
}

class StrategyFactory{

    static HashMap<String, PaymentStrategy> strategies = new HashMap<>();

    static {
        strategies.put("adyen",new AdyenStrategy());
        strategies.put("master",new MasterCardStrategy());
    }

    public PaymentStrategy getStrategy(String name){
        return strategies.get(name);
    }
}

public class StrategyPattern {

    public static void main(String[] args) {
        PaymentStrategy strategy = new StrategyFactory().getStrategy("master");
        strategy.Pay();
    }

}
