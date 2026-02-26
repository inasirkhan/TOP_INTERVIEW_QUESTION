package top150.arraystrings.interview;


abstract class a{
    abstract public void demo();
}

interface b{
    void demo();
}

class C extends a implements b {


    @Override
    public void demo() {
        System.out.println("hello");
    }
}
public class OverridingScenario {

    public static void main(String[] args) {
        C c = new C();
        c.demo();
    }
//👉 Only one implementation is required.
//👉 That implementation satisfies both the abstract class and the interface contract.
}
