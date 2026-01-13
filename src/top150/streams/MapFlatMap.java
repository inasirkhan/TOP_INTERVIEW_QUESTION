package top150.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {

    static class Employee {

        private int id;
        private String name;
        private String department;
        private String[] hobbies;

        public Employee() {
        }

        public Employee(int id, String name, String department, String[] hobbies) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.hobbies = hobbies;
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

        public String[] getHobbies() {
            return hobbies;
        }

        public void setHobbies(String[] hobbies) {
            this.hobbies = hobbies;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", hobbies=" + Arrays.toString(hobbies) +
                    '}';
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Nasser", "IT", new String[]{"Cricket", "Voliball"});
        Employee employee2 = new Employee(102, "Mohit", "CIVIL", new String[]{"Football", "Badminton"});
        Employee employee3 = new Employee(101, "Shakib", "IT", new String[]{"Panting", "Cricket"});
        Employee employee4 = new Employee(101, "Rohit", "CS", new String[]{"Ludo", "Football"});

        List<Employee> employeeList = Arrays.asList(employee, employee2, employee3, employee4);
        List<String> collect = employeeList.stream().
                flatMap(employee1 -> Arrays.stream(employee.getHobbies())).collect(Collectors.toList());
        System.out.println(collect);

        Optional<Employee> first = employeeList.stream().findFirst();
        System.out.println(first);

        List<String> nassStream = List.of("Nass", "Ash", "Rock", "Truth");
        Map<Integer, String> collect1 = nassStream.stream().collect(Collectors.toMap(
                name -> nassStream.indexOf(name) + 1,
                name -> name
        ));
        System.out.println(collect1);


        List<String[]> list = employeeList.stream().map(e -> e.getHobbies()).toList();
        System.out.println(list);

        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(3, 5),
                Arrays.asList(4, 6),
                Arrays.asList(9, 8)
        );

        List<Stream<Integer>> list1 = nums.stream().map(e -> e.stream()).toList();
        List<Integer> list2 = nums.stream().flatMap(e -> e.stream()).toList();
        System.out.println(list1);
        System.out.println(list2);


    }
}
