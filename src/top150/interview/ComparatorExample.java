package top150.interview;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class Student1 implements Comparable<Student1> {
//    private String name;
//    private int age;
//
//    // Constructor
//    public Student1(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Getters
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    // Override compareTo method to sort by name
//
//
//    // Override toString for better display of Student objects
//    @Override
//    public String toString() {
//        return "Student{name='" + name + "', age=" + age + '}';
//    }
//
//    @Override
//    public int compareTo(Student1 o) {
////        return Integer.compare(this.age, o.age); // accending order
////        return Integer.compare(o.age, this.age); // dccending order
//        return this.name.compareTo(o.name);
//    }
//}


// Main method to demonstrate sorting
public class ComparatorExample {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Student> students = new ArrayList<>();
        Constructor<Student> declaredConstructor = Student.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student student1 = declaredConstructor.newInstance();

//        Comparator<Student> ageComparator = (s1, s2 )->  Integer.compare(s1.getAge(), s2.getAge());


        // Add students to the list
//        students.add(new Student("Bob", 22));
//        students.add(new Student("Alice", 20));
//        students.add(new Student("Charlie", 43));
//        students.add(new Student("Nasser", 27));
//        students.add(new Student("Charlie", 24));

        // Print unsorted list
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the list
//        Collections.sort(students);
//          students.sort(ageComparator);
        // Print sorted list
        System.out.println("\nAfter sorting by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    class GenericClass <T> {

    }

    public static <T extends Number> Number addNumbers(T a, T b){
        return a.doubleValue()* b.doubleValue();
    }


}
