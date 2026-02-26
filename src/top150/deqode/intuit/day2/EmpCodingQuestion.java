package top150.deqode.intuit.day2;

import java.util.*;
import java.util.stream.Collectors;

public class EmpCodingQuestion {

    public static void printEmployees(List<Employee> employees){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
//        average age of male and female employee
        List<Employee> employeeList = Employee.getEmployeeList();
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(collect);

        System.out.println("*********************************************");

//        highest paid employee in each department
        Map<String, Optional<Employee>> collect1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        collect1.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        System.out.println("*************************************************");

//        all employee who joined after 2020
        List<Employee> list = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2020)
                .toList();
        printEmployees(list);

        System.out.println("***************************************************");

        Map<Integer, List<Integer>> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getId, Collectors.toList())));
        System.out.println(collect2);

        System.out.println("**************************************************");

        Map<String, Double> collect3 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collect3);

        System.out.println("*********************************************");

//       Youngest male employee in Product Development using stream api?
        Optional<Employee> male = employeeList.stream().filter(emp -> emp.getGender().equals("Male"))
                .filter(emp-> emp.getDepartment().equalsIgnoreCase("Product Development"))
                .sorted(Comparator.comparing(Employee::getAge))
                .findFirst();
        System.out.println(male.get());

//        Using Stream API, given an Employee list,
//        find employees whose age is greater than 25
//        and salary is greater than 45,000, and who belong to the same city.

        Map<String, List<Employee>> collect4 = employeeList.stream().filter(emp -> emp.getAge() > 25)
                .filter(emp -> emp.getSalary() > 45000)
                .collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(collect4);

        System.out.println("**********************************************");

//        Most experienced employee using stream api?
//         employeeList.stream().max(Comparator.comparing(Employee::getExperince));

//        Count males and females in Sales & Marketing team using stream api?
        Map<String, Long> collect5 = employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("count of male and female : "+collect5);

        System.out.println("****************************************");
//        Average and total salary of whole organization  using stream api?
        double asDouble = employeeList.stream()
                .mapToInt(Employee::getAge)
                .average().getAsDouble();
        double totalSalary = employeeList.stream().mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("Avg Salary : "+asDouble+" Total Salary : "+totalSalary);
        System.out.println("****************************************");

//       Separate employees younger/equal to 25 and older than 25  using stream api?
        Map<Boolean, List<Employee>> collect6 = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() <= 25));
        Set<Map.Entry<Boolean, List<Employee>>> entries = collect6.entrySet();
        for(Map.Entry<Boolean,List<Employee>> entry : entries){
            System.out.println("key "+entry.getKey());
            System.out.println("value "+entry.getValue());
            System.out.println("--------------------------------------------");
        }

        System.out.println("***********************************************");

        System.out.println("****************************************");
//        Oldest employee – age + department  using stream api?
        Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println(max.get());

//        employee with second highest salary
        Optional<Employee> secondHigestSalEmployee = employeeList.stream()
                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                .distinct()
                .skip(1)
                .findFirst();
        System.out.println(secondHigestSalEmployee.get());
//        won't work as objects are unique but salary is duplicate
        Optional<Double> first = employeeList.stream().map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();
        System.out.println(first.get());

        Optional<Employee> first1 = employeeList.stream().filter(emp -> emp.getSalary() == first.get()).findFirst();
        System.out.println(first1.get());

//        find department which has most no of employees
        Map<String, Long> collect7 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect7);

        String stringLongEntry = collect7.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();
        System.out.println(stringLongEntry);

    }
}
