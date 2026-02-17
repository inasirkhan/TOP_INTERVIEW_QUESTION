package top150.deqode.desingpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//    Eager Initialization
class Singleton1{
    public static final Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }
}


//    Lazy Initialization
class Singleton2{
    public static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (instance == null){
            return new Singleton2();
        }
        return instance;
    }
}

// Thread safe Initialization
class Singleton{

    static Singleton instance;

    private Singleton(){
//        if (instance !=null){
//            throw new RuntimeException("Instance already exist");
//        }
    }
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}

// double check locking
class Singleton5 {
    private static volatile Singleton5 instance;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}

enum Singleton6 {
    INSTANCE;
//    enum Singleton is the best approach as it handles thread safety, serialization, and reflection automatically
}


public class SingletonPattern {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        System.out.println("normal hashcode : "+ singleton.hashCode());
        Singleton instance = Singleton.getInstance();
        System.out.println("normal hashcode : "+instance.hashCode());

//        using reflection
        Constructor<Singleton> constructor =
                Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        System.out.println("reflection hashcode "+singleton1.hashCode());


//       ways to create singleton class
//       Eager Initialization

    }
}
