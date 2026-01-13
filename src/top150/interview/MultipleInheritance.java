package top150.interview;


interface sim{

    void makeCall();

    void sendMsg();
}

interface Jio extends sim{

    default  void makeCall(){
        System.out.println("Make call using Jio");
    }


    default void sendMsg(){
        System.out.println("Send Msg using Jio");
    }
}

interface  Airtel extends  sim{

    default void makeCall(){
        System.out.println("Make call using Airtel");
    }

    default void sendMsg(){
        System.out.println("Send Msg using Airtel");
    }
}

class Phone implements Jio, Airtel{

    public void makeCall() {
        Jio.super.makeCall();
    }


    public void sendMsg() {
        Airtel.super.sendMsg();
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.makeCall();
        phone.sendMsg();
    }
}
