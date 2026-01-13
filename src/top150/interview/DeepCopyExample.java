package top150.interview;

import java.util.ArrayList;
import java.util.List;

class Student implements Cloneable{
    String name;

    public Student(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    List<String> hobbies;


    public Student deepCopy(){
        Student stu = this.clone();
        stu.hobbies = new ArrayList<>(this.hobbies);
        return stu;
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}

public class DeepCopyExample {

    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Traveling");
        Student student = new Student("Nasser",  hobbies);

//        Shallow copy
        Student student1 = student;
        student1.name = "Mohit";
        System.out.println(student);
        System.out.println(student1);

//        deep copy
        Student student2 = student.deepCopy();
        student.hobbies.add("cricket");
        System.out.println(student1);
        System.out.println(student2);
    }
}
