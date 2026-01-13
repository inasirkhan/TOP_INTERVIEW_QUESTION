package top150.practice2;

public class InnerCalss {

    class inner{

    }

    public static void main(String[] args) {
        InnerCalss innerCalss = new InnerCalss();
        InnerCalss.inner  obj =  innerCalss.new inner();
    }
}
