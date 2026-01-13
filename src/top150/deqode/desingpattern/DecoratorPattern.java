package top150.deqode.desingpattern;

interface Coffee{

    String getDescription();
    int cost();
}

class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public int cost() {
        return 10;
    }
}

abstract class CoffeeDecorator implements Coffee {

    Coffee coffee;
    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public int cost() {
        return coffee.cost() + 10;
    }
}

class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public int cost() {
        return coffee.cost() + 5;
    }
}

public class DecoratorPattern {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " = " + coffee.cost());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription() + " = " + coffee.cost());

        System.out.println(-5-2%13+"DEEPAK"+-1);
    }
}