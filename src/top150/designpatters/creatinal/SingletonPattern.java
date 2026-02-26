package top150.designpatters.creatinal;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SingleTone implements Serializable, Cloneable{

    private static SingleTone instance;

    private SingleTone(){
//      WAY TO STOP CREATION OF MULTIPLE OBJECTS USING REFLECTION API
//        if (instance!=null){
//            throw new RuntimeException("Instance already exist");
//        }
        System.out.println("Single Object Created");
    }

    public static SingleTone getInstance(){
        if (instance==null){
            instance = new SingleTone();
        }
        return instance;
    }

//    none thread safe env we could create two objects so, put creation logic in synchronized block
    public static SingleTone getInstanceSynchronized(){
        synchronized (SingleTone.class){
            if (instance==null){
                instance = new SingleTone();
            }
            return instance;
        }
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    public SingleTone clone() {
        return  instance;
    }
}

class Singleton{

    private Singleton(){

    }

    private static final class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return InstanceHolder.instance;
    }

}

public class SingletonPattern {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SingleTone instance = SingleTone.getInstance();
        System.out.println("Instance One Hashcode  : "+instance.hashCode());
        SingleTone instance2 = SingleTone.getInstanceSynchronized();
        System.out.println("Instance Two Hashcode  : "+instance2.hashCode());

//        WAYS TO BREAK SINGLETON PATTERN

//        (1) REFLECTION API
        Constructor<SingleTone> constructor = SingleTone.class.getDeclaredConstructor();
        constructor.setAccessible(true);
//        SingleTone instance3 = constructor.newInstance();
//        System.out.println("Instance Three Hashcode : "+instance3.hashCode());

//        (2) SERIALIZATION

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        outputStream.writeObject(instance);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        SingleTone instance4 = (SingleTone) inputStream.readObject();
        System.out.println("Instance Four Hashcode  : "+instance4.hashCode());

        outputStream.close();
        inputStream.close();

//        Solution: to prevent that implement object readResolve() method

//        (4) breaking singleton pattern using clone method

        SingleTone singleton3 = (SingleTone) instance.clone();
        System.out.println("Instance Five Hashcode :  "+singleton3.hashCode());

//        Solution: to prevent return same object from overridden clone method

    }
}
