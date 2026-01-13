package top150.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatch {

    public static void main(String[] args) {
        MapFlatMap.Employee employee = new MapFlatMap.Employee(101, "Nasser", "IT", new String[]{"Cricket", "Voliball"});
        MapFlatMap.Employee employee2 = new MapFlatMap.Employee(102, "Mohit", "CIVIL", new String[]{"Football", "Badminton"});
        MapFlatMap.Employee employee3 = new MapFlatMap.Employee(101, "Shakib", "IT", new String[]{"Panting", "Cricket"});
        MapFlatMap.Employee employee4 = new MapFlatMap.Employee(101, "Rohit", "CS", new String[]{"Ludo", "Football"});

        List<MapFlatMap.Employee> employeeList = Arrays.asList(employee, employee2, employee3, employee4);

        List<MapFlatMap.Employee> collect = employeeList.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("CIVIL"))
                .filter(emp -> Arrays.stream(emp.getHobbies()).anyMatch(hob -> hob.equalsIgnoreCase("Football")))
                .collect(Collectors.toList());

        System.out.println("EMPLOYEE IN IT AND HOBBIES CRICKET "+collect);


//        anyMatch()  IF SINGLE ELEMENT MATCH RETURN TRUE
//        allMatch()  IF ALL ELEMENT MATCH RETURN TRUE
//        noneMatch() IF NONE ELEMENT MATCH RETURN TRUE


    }
}
