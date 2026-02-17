package top150.deqode.desingpattern;

abstract class DeveloperFactory{

    abstract Developer getDeveloper(String name);

}

class BackendDevFactory extends DeveloperFactory {

    @Override
    Developer getDeveloper(String name) {
        return switch (name){
            case "java" -> new JavaDeveloper();
            case "python" -> new PythonDeveloper();
            default ->  null;
        };
    }
}

class FrontEndDevFactory extends DeveloperFactory{

    @Override
    Developer getDeveloper(String name) {
        return switch (name){
            case "react" -> new ReactDeveloper();
            default -> null;
        };
    }
}

class FactoryProducer {

    public static DeveloperFactory getFactory(String type) {
        return switch (type) {
            case "backend" -> new BackendDevFactory();
            case "frontend" -> new FrontEndDevFactory();
            default -> throw new RuntimeException("Factory not found");
        };
    }
}


public class AbstractFactoryPattern {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = FactoryProducer.getFactory("backend");
        Developer developer = developerFactory.getDeveloper("java");
        developer.getName();

        DeveloperFactory developerFactory1 = FactoryProducer.getFactory("frontend");
        Developer developer1 = developerFactory1.getDeveloper("react");
        developer1.getName();
    }
}
