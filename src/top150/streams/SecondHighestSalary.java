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

        List<Employee> salDes = employees.stream().sorted((e1, e2) -> Long.compare(e1.getSalary(), e2.getSalary())).collect(Collectors.toList());
        System.out.println(salDes);

        Optional<Employee> ankita = employees.stream().filter(e -> e.name.equalsIgnoreCase("ankita")).findFirst();
        System.out.println(ankita.get());

//        HIGHEST SALARY OF EACH DEPARTMENT
        Map<String, Optional<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingLong(Employee::getSalary))));
        System.out.println(collect1);

//        distinct() removes duplicates based on equals and hashCode,
//        not based on salary. Therefore it cannot be used directly
//        to find second highest salary unless equals is overridden on salary.

//        SECOND HIGHEST SALARY
        Optional<Long> first = employees.stream()
                .map(Employee::getSalary)
                        .distinct()
                                .sorted(Comparator.reverseOrder())
                                        .skip(1)
                                                .findFirst();
        System.out.println("Second Highest Salary : "+first.get());
//        SECOND HIGHEST SALARY EMPLOYEE
        Optional<Employee> second = employees.stream().map(Employee::getSalary)
                .distinct().sorted(Comparator.reverseOrder()).skip(1)
                .findFirst()
                .flatMap(sal -> employees.stream().filter(emp -> Objects.equals(emp.getSalary(), sal)).findFirst());
        System.out.println("Second Highest Salary Employee : "+second.get());

        Optional<Employee> first1 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .distinct()
                .skip(1)
                .findFirst();
        System.out.println(first1.get());

//        Salary between 20k to 35k
        List<Employee> list1 = employees.stream().filter(emp -> emp.getSalary() >= 20000 && emp.getSalary() <= 35000).toList();
        System.out.println(list1);

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
