package top150.deqode.intuit.day6;

interface developer{

    void getDeveloper();
}
class javaDeveloper implements developer{

    @Override
    public void getDeveloper() {
        System.out.println("java Developer");
    }
}

class pythonDeveloper implements developer{

    @Override
    public void getDeveloper() {
        System.out.println("python developer");
    }
}
class reactDeveloper implements developer{

    @Override
    public void getDeveloper() {
        System.out.println("react developer");
    }
}


abstract class DeveloperFactory{

    public abstract developer getDeveloper(String name);

}

class BackendDeveloperFactory extends DeveloperFactory{

    @Override
    public developer getDeveloper(String name) {
        return switch (name){
            case "java" -> new javaDeveloper();
            case "python" -> new pythonDeveloper();
            default -> null;
        };
    }
}

class FrontEndDeveloperFactory extends DeveloperFactory{

    @Override
    public developer getDeveloper(String name) {
        return switch (name){
            case "react" -> new reactDeveloper();
            default -> null;
        };
    }
}

class FactoryProducer{

    public static DeveloperFactory getDeveloperFactory(String type){
        return switch (type){
          case "backend" -> new BackendDeveloperFactory();
          case "frontend" -> new FrontEndDeveloperFactory();
            default -> null;
        };
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        DeveloperFactory backed = FactoryProducer.getDeveloperFactory("backend");
        developer java = backed.getDeveloper("java");
        java.getDeveloper();
    }
}
