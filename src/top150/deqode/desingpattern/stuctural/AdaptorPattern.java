package top150.deqode.desingpattern.stuctural;

class OldCharger{

    public void chargeWithOldPin(){
        System.out.println("charge with old pin");
    }
}

interface NewCharger {

    void chargeWithNewPin();
}

class ChargeAdaptor implements NewCharger {

    OldCharger oldCharger;

    ChargeAdaptor(OldCharger oldCharger){
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithNewPin() {
        oldCharger.chargeWithOldPin();
    }
}

public class AdaptorPattern {

    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        ChargeAdaptor chargeAdaptor = new ChargeAdaptor(oldCharger);
        chargeAdaptor.chargeWithNewPin();
    }

}
