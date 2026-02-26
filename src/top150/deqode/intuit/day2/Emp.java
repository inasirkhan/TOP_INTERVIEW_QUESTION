package top150.deqode.intuit.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee
{
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    String city;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary,String city)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.city = city;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && yearOfJoining == employee.yearOfJoining && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(department, employee.department) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, department, yearOfJoining, salary, city);
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary
                +", City : "+city;
    }

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jennifer", 22, "Female", "HR", 2017, 55000.0,"Indore"));
        employeeList.add(new Employee(111, "Jennifer", 22, "Female", "HR", 2017, 55000.0,"Indore"));
//        employeeList.add(new Employee(112, "Rohit", 35, "Male", "Sales And Marketing", 2019, 23500.0,"Bangalore"));
//        employeeList.add(new Employee(113, "Shubman", 29, "Male", "Infrastructure", 2019, 28000.0,"Bangalore"));
//        employeeList.add(new Employee(114, "Rinku", 28, "Male", "Product Development", 2020, 62500.0,"Bangalore"));
//        employeeList.add(new Employee(114, "Pinku", 28, "Male", "Product Development", 2020, 62500.0,"Bangalore"));
//        employeeList.add(new Employee(115, "Aaditi", 41, "Female", "HR", 2022, 29700.0,"Mumbai"));
//        employeeList.add(new Employee(116, "Mahendra", 43, "Male", "Security And Transport", 2023, 20500.0,"Mumbai"));
//        employeeList.add(new Employee(117, "Nitish", 35, "Male", "Account And Finance", 2019, 37000.0,"Mumbai"));
//        employeeList.add(new Employee(118, "Aditya", 31, "Male", "Product Development", 2019, 34500.0,"Indore"));
//        employeeList.add(new Employee(119, "Monika", 24, "Female", "Sales And Marketing", 2021, 21500.0,"Indore"));
//        employeeList.add(new Employee(120, "Aman", 38, "Male", "Security And Transport", 2021, 31000.5,"Hyderabad"));
//        employeeList.add(new Employee(121, "Sangeeta", 27, "Female", "Infrastructure", 2021, 35000.0,"Hyderabad"));
//        employeeList.add(new Employee(122, "Joshi", 25, "Male", "Product Development", 2020, 29000.0,"Hyderabad"));
//        employeeList.add(new Employee(123, "Jeddy", 27, "Female", "Account And Finance", 2020, 29000.0,"Indore"));
//        employeeList.add(new Employee(124, "Niden", 24, "Male", "Sales And Marketing", 2020, 30200.5,"Bangalore"));
//        employeeList.add(new Employee(125, "Saig", 23, "Male", "Infrastructure", 2019, 42700.0,"Mumbai"));
//        employeeList.add(new Employee(126, "Saey", 26, "Female", "Product Development", 2018, 38900.0,"Indore"));
//        employeeList.add(new Employee(127, "Shreyas", 24, "Male", "Product Development", 2018, 35700.0,"Hyderabad"));

        return employeeList;
    }
}
