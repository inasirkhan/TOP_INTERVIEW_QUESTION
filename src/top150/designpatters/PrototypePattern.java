package top150.designpatters;

class Employee implements Cloneable{
    int id;
    String name;
    String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class PrototypePattern {

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Nasser Khan", "Indore");
        Employee employee2 = employee.clone();
        System.out.println(employee == employee2);
    }
}
