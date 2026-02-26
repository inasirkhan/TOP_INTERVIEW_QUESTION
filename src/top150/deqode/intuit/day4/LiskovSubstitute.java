package top150.deqode.intuit.day4;

interface Shape{

    int findArea();
}

class Rectangle implements Shape{

    int length;
    int hight;

    public Rectangle(int length, int hight){
        this.length = length;
        this.hight = hight;
    }

    @Override
    public int findArea() {
        return length*hight;
    }
}

class Square implements Shape{

    private int size;

    public Square(int square){
        this.size = square;
    }

    @Override
    public int findArea() {
        return size*size;
    }
}

public class LiskovSubstitute {

    public static void main(String[] args) {
        Shape shape= new Square(5);
        System.out.println(shape.findArea());
        Shape shape1 = new Rectangle(5, 4);
        System.out.println(shape1.findArea());
    }
}
