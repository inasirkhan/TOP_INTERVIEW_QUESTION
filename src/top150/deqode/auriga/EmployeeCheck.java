package top150.deqode.auriga;

public class EmployeeCheck {

    float salary = 30000;
}
class Salary extends EmployeeCheck{

    void disp(){
        float bonous = 1000;
        EmployeeCheck employeeCheck = new EmployeeCheck();
        float total = employeeCheck.salary + bonous;
        System.out.println("total salary : "+total);
    }

    public static void main(String[] args) {
        Salary salary1 = new Salary();
        salary1.disp();
    }
}
