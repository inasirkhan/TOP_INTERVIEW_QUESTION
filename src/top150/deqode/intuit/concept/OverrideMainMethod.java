package top150.deqode.intuit.concept;

class G{

    public static void main(String[] args) {
        System.out.println("parent method");
    }
}
class H extends G{
    public static void main(String[] args) {
        System.out.println("child methode");
    }
}
public class OverrideMainMethod {

    public static void main(String[] args) {
        H.main(null);
    }
}
