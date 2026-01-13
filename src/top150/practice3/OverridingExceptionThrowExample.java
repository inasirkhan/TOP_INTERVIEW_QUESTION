package top150.practice3;

import java.sql.SQLException;

class testOver{
    void show() throws SQLException {
        System.out.println("Parent class show method");
    }
}

public class OverridingExceptionThrowExample  extends  testOver{
    @Override  // CHILD CLASS CONNOT THROW PARENT CLASS CHECKED EXCEPTION
    void show() throws SQLException{
        System.out.println("Child class show method");
    }

    public static void main(String[] args) throws Exception {
        testOver obj = new OverridingExceptionThrowExample();
        obj.show();
    }
}
