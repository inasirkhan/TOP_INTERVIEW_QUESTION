package top150.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirst {

    public static void main(String[] args) {
        List<String> nameList = List.of("Nasser", "Mohit", "Aakash", "Rohit");

        Optional<String> firstName = nameList.stream().findFirst();

        System.out.println("FIND FIRST "+firstName.get());

        List<String> fullNames = nameList.stream()
                .map(
                        name -> name.endsWith("r")
                                ? name.concat(" Khan")
                                : name.concat(" Sharma")
                )
                .toList();

        System.out.println("FULL NAMES "+fullNames);

        Optional<String> first = nameList.stream()
                .map(
                        name -> name.endsWith("r")
                                ? name.concat(" Khan")
                                : name.concat(" Sharma")
                )
                .findFirst();

        System.out.println("FIRST FULL NAME "+first.get());

        MapFlatMap.Employee employee = new MapFlatMap.Employee(101, "Nasser", "IT", new String[]{"Cricket", "Voliball"});
        MapFlatMap.Employee employee2 = new MapFlatMap.Employee(102, "Mohit", "CIVIL", new String[]{"Football", "Badminton"});
        MapFlatMap.Employee employee3 = new MapFlatMap.Employee(101, "Shakib", "IT", new String[]{"Panting", "Cricket"});
        MapFlatMap.Employee employee4 = new MapFlatMap.Employee(101, "Rohit", "CS", new String[]{"Ludo", "Football"});

        List<MapFlatMap.Employee> employeeList = Arrays.asList(employee, employee2, employee3, employee4);
        Optional<MapFlatMap.Employee> secondEmp = employeeList.stream().
                filter(
                        emp ->
                                Arrays.stream(emp.getHobbies())
                                        .anyMatch(hob -> hob.equalsIgnoreCase("Cricket")
                                        )
                )
                .skip(1)
                .findFirst();

        System.out.println("EMPLOYEE AFTER SKIPPING FIRST "+secondEmp);

    }
}
