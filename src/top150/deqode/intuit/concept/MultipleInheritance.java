package top150.deqode.intuit.concept;

interface a{
    void show();
}

interface b{
    void show();
}
class R implements a,b{


    @Override
    public void show() {
//        to avoid ambiguity we will override default method
        System.out.println("called");
    }
}
class MultipleInheritance {

    public static void main(String[] args) {
        new R().show();
    }
}