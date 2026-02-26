package top150.deqode.solid;


class UserService {
    void saveUser() {};
    void sendEmail() {};
}

// 1 single responsibility
class UserServiceS {
    void saveUser() {};
}
class EmailService{
    void sendEmail() {};
}

// Open Close Principal
interface Shape{
    int area();
}
class Circle implements Shape{

    @Override
    public int area() {
        System.out.println("circle area");
        return 0;
    }
}
// any new shape will be added in new class, no modification

//dependency inversion principal
//class Car {
//    PetrolEngine engine = new PetrolEngine();
//}

interface Engine{}
class PatrolEngine implements Engine{}
class DecelEngine implements Engine{}

class Car{
    Engine engine;
}

// LIS-COVE SBUTSTION
interface Shape1 {

    void Area();
}

class Rectangle implements Shape1 {
    int width;
    int height;

    @Override
    public void Area() {
        System.out.println(width*height);
    }
}

class Square implements Shape1 {

    int side;
    @Override
    public void Area() {
        System.out.println(side*side);
    }
}

public class Principals {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height=10;
        rectangle.width=5;
        Square square = new Square();
        square.side = 10;
        rectangle.Area();
        square.Area();

    }
}
