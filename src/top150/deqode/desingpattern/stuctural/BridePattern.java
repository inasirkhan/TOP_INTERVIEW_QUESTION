package top150.deqode.desingpattern;

interface Device{
    void TurnOn();
    void TurnOff();
}

class TV implements Device{

    @Override
    public void TurnOn() {
        System.out.println("TV turn on");
    }

    @Override
    public void TurnOff() {
        System.out.println("TV turn off");
    }
}
class Radio implements Device{

    @Override
    public void TurnOn() {
        System.out.println("Radio turn on");
    }

    @Override
    public void TurnOff() {
        System.out.println("Radio turn off");
    }
}

abstract class RemoteControl {
    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }

    abstract void power();
}

class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    public void power() {
        device.TurnOn();
    }
}


public class BridePattern {

    public static void main(String[] args) {
        RemoteControl tvRemote = new BasicRemote(new TV());
        tvRemote.power();

        RemoteControl radioRemote = new BasicRemote(new Radio());
        radioRemote.power();
    }
}
