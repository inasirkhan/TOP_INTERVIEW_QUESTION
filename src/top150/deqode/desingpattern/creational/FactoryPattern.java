package top150.deqode.desingpattern.creational;

interface Developer{
    void getName();
}

class JavaDeveloper implements Developer{

    @Override
    public void getName() {
        System.out.println("Java Developer");
    }
}

class PythonDeveloper implements Developer{

    @Override
    public void getName() {
        System.out.println("Python Developer");
    }
}
class ReactDeveloper implements Developer{

    @Override
    public void getName() {
        System.out.println("React Developer");
    }
}

public class FactoryPattern {

    static Developer getDeveloper(String name){
        return switch (name){
            case "java" -> new JavaDeveloper();
            case "python" -> new PythonDeveloper();
            case "react" -> new ReactDeveloper();
            default -> throw new RuntimeException("no developer found");
        };
    }

//   optimize it using map
    public static void main(String[] args) {
        Developer developer = getDeveloper("java");
        developer.getName();
    }
}
