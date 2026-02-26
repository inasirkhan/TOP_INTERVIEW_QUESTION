package top150.deqode.intuit.concept;


import java.util.HashMap;
import java.util.Map;

class Employee {

    Long empid;

    public Employee() {
    }

    public Employee(long empid){
        this.empid =empid;
    }

    public Employee(Integer id, String name) {
        System.out.println("object created using functional interface");
    }

    public long getEmpid() {
        return this.empid;
    }

    public void setEmpId(long empid) {
        this.empid = empid;
    }

}
public class MapConcept {

    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();

        Employee e = new Employee(1);
        map.put(e, "one");

        e = new Employee(2);
        map.put(e, "two");

        e = new Employee(3);
        map.put(e, "three");

        e = new Employee(1);

        System.out.println(map.size());
        System.out.println(map.get(e));
    }
}
