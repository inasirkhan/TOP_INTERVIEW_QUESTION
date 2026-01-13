package top150.designpatters;

class PaperPen{

    public void mark(String str){
        System.out.println(str);
    }
}

interface DigitalPen{

    void write(String str);
}

class PenAdepter implements DigitalPen{

    PaperPen normalPen = new PaperPen();

    @Override
    public void write(String str) {
        normalPen.mark(str);
    }
}

class Assignment{

    DigitalPen digitalPen;

    public void writeAssignment(String str){
        digitalPen.write(str);
    }
}



public class AdapterPattern {

    public static void main(String[] args) {
        PenAdepter penAdepter = new PenAdepter();
        Assignment assignment = new Assignment();
        assignment.digitalPen = penAdepter;
        assignment.writeAssignment("I am writing using normal pen");
    }
}
