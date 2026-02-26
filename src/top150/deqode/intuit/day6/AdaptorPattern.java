package top150.deqode.intuit.day6;

class OldCharger{

    public void chargeWithOldPin(){
        System.out.println("charge with old pin");
    }
}

interface NewCharger{

    void chargeWithNewPin();
}

class ChargerAdaptor implements NewCharger{

    OldCharger oldCharger;

    ChargerAdaptor(OldCharger oldCharger){
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithNewPin() {
        oldCharger.chargeWithOldPin();
    }
}

public class AdaptorPattern {
    public static void main(String[] args) {
        ChargerAdaptor chargerAdaptor = new ChargerAdaptor(new OldCharger());
        chargerAdaptor.chargeWithNewPin();
    }
}
