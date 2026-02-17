package top150.designpatters;

class Phone{

    public void printName(){
        System.out.println("Phone");
    }
}
class Apple extends Phone{

    @Override
    public void printName() {
        System.out.println("Apple");
    }
}
class SamSung extends Phone{

    @Override
    public void printName() {
        System.out.println("SamSung");
    }
}
class MotoG extends Phone{

    @Override
    public void printName() {
        System.out.println("MotoG");
    }
}

public class FactoryPattern {

    public static Phone getPhoneFactory(String name){
        if (name.equalsIgnoreCase("APPLE")){
            return new Apple();
        }
        if (name.equalsIgnoreCase("SAMSUNG")){
            return new SamSung();
        }
        if (name.equalsIgnoreCase("MotoG")){
            return new MotoG();
        }
        return null;
    }

    public static void main(String[] args) {
        Phone apple = FactoryPattern.getPhoneFactory("motoG");
        apple.printName();
    }
}
