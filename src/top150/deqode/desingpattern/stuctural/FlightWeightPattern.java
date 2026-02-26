package top150.deqode.desingpattern.stuctural;

import java.util.HashMap;
import java.util.Map;

class Tree {
    // Intrinsic (shared)
    String color;
    String type;

    Tree(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // Extrinsic (passed from outside)
    void display(int x, int y) {
        System.out.println(type + " (" + color + ") at " + x + "," + y);
    }
}

class TreeFactory {
    private static Map<String, Tree> map = new HashMap<>();

    static Tree getTree(String color, String type) {
        String key = color + "-" + type;

        if (!map.containsKey(key)) {
            map.put(key, new Tree(color, type));
        }
        return map.get(key);
    }
}

public class FlightWeightPattern {

    public static void main(String[] args) {

        Tree t1 = TreeFactory.getTree("Green", "Oak");
        t1.display(10, 20);

        Tree t2 = TreeFactory.getTree("Green", "Oak");
        t2.display(30, 40);

        Tree t3 = TreeFactory.getTree("Green", "Oak");
        t3.display(50, 60);
    }
}
