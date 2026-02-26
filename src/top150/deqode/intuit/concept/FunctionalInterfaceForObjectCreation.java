package top150.deqode.intuit.concept;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class FunctionalInterfaceForObjectCreation {

    public static void main(String[] args) {
//       object creation using functional interface
        Supplier<Employee> employeeSupplier = ()-> new Employee();
        System.out.println(employeeSupplier.get());

//       parametrized object creation using function
        BiFunction<Integer,String,Employee> employeeBiFunction = (id, name)-> {
            return new Employee(id, name);
        };

        Employee nasser = employeeBiFunction.apply(101, "Nasser");
    }
}
