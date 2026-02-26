package top150.deqode.intuit.day6;

interface devic{

    void turnOn();
    void turnOff();
}
class Tv implements devic{

    @Override
    public void turnOn() {
        System.out.println("tv turn on!");
    }

    @Override
    public void turnOff() {
        System.out.println("tv turn off!");
    }
}

class Radio implements devic{

    @Override
    public void turnOn() {
        System.out.println("radio turn on!");
    }

    @Override
    public void turnOff() {
        System.out.println("radio turn off!");
    }
}

abstract class Remote {

    devic devic;

    Remote(devic devic){
        this.devic = devic;
    }

    abstract void power();
}

class BasicRemote extends Remote{

    BasicRemote(devic de) {
        super(de);
    }

    @Override
    void power() {
        devic.turnOn();
    }
}
public class BridgePattern {

    public static void main(String[] args) {
        BasicRemote basicRemote = new BasicRemote(new Radio());
        BasicRemote basicRemote1 = new BasicRemote(new Tv());
        basicRemote1.power();
        basicRemote.power();
    }
}
