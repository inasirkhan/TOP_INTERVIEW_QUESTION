package top150.deqode.intuit.day6;

class UserService{

    void saveUser(){}
    void sendEmail(){}
}

interface shape{

    int area();
}

class Rectangle implements shape{

    int height;
    int width;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width* this.height;
    }
}

class Square implements shape{

    int size;

    public Square(int size){
        this.size = size;
    }

    @Override
    public int area() {
        return size*size;
    }
}
public class SolidPrincipals {

    public static void main(String[] args) {
        shape rectangle = new Rectangle(12, 14);
        shape square = new Square(12);
        System.out.println(rectangle.area());
        System.out.println(square.area());
    }
}
