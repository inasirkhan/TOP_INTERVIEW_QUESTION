package top150.deqode.xebia;

record student(int id,String name){}

public class RecordPractice {

    public static void main(String[] args) {
        student student = new student(101, "Nasser Khan");
        student student2 = new student(102, "Tas Khan");

//        A record is an immutable data carrier that reduces boilerplate by auto-generating constructors,
//        accessors, and equality methods, while traditional DTOs are mutable,
//        verbose, and more flexible. Records are best for read-only data transfer,
//        while DTOs are better for mutable or framework-heavy use cases.
    }
}
