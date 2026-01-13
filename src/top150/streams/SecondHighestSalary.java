package top150.streams;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestSalary {


    public static void main(String[] args) {

        SecondHighestSalary.Employee employee = new SecondHighestSalary.Employee(101, "Nasser", "IT", 20000L);
        SecondHighestSalary.Employee employee2 = new SecondHighestSalary.Employee(102, "Mohit", "CIVIL", 35000L);
        SecondHighestSalary.Employee employee3 = new SecondHighestSalary.Employee(103, "Shakib", "IT", 26990L);
        SecondHighestSalary.Employee employee4 = new SecondHighestSalary.Employee(104, "Raza", "CIVIL", 26990L);
        SecondHighestSalary.Employee employee5 = new SecondHighestSalary.Employee(105, "Rohit", "CS", 41000L);
        SecondHighestSalary.Employee employee6 = new SecondHighestSalary.Employee(106, "Ankita", "CS", 41000L);

        List<Employee> employees = Arrays.asList(employee, employee2, employee3, employee4,employee5, employee6);


        List<Employee> sorted = employees.stream().
                sorted((e1, e2) -> e1.getSalary()<e2.getSalary()?1:e1.getSalary()>e2.getSalary()?-1:0)
                .toList();

//        employees.stream().sorted((e1, e2)-> e1.getSalary()<e2.getSalary()?1:e1.getSalary()> e1.getSalary()?1:0)

        Comparator<Employee> salComparator = (e1,e2)-> e1.getSalary().compareTo(e2.getSalary());

        System.out.println(sorted);

        int secondHighestSalary = employees.stream().
                sorted((Comparator.comparing(e->e.getSalary())))
                .skip(1)
                .findFirst()
                .get().getSalary().intValue();

        System.out.println(secondHighestSalary);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary));

//        EMPLOYEE WITH SAME SALARY
        Map<Long, List<Employee>> empWithSameSalary = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(empWithSameSalary);

//        EMPLOYEE WITH SAME SALARY COUNT
        Map<Long, Long> EmployeeWithSameSalCount = employees.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));
        System.out.println(EmployeeWithSameSalCount);

//        EMPLOYEE WITH NAME ANKITA, SALARY DESCENDING
        employees.stream().filter(e->e.getName().equalsIgnoreCase("ankita")).forEach(System.out::println);
        List<Employee> list = employees.stream().sorted((e1, e2) -> Long.compare(e2.getSalary(), e1.getSalary())).toList();
        System.out.println(list);

//       employees id based on their salary
        Map<Long, List<Integer>> collect = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getSalary(), Collectors.mapping(e -> e.id, Collectors.toList())));
        System.out.println(collect);
    }

    static class Employee {

        private int id;
        private String name;
        private String department;
        private Long Salary;

        public Employee(int id, String name, String department, Long salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            Salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Long getSalary() {
            return Salary;
        }

        public void setSalary(Long salary) {
            Salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", Salary=" + Salary +
                    '}';
        }
    }
}
