package top150.deqode.xebia;

import java.util.HashMap;
import java.util.Map;

class MyKey {
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "MyKey{}";
    }
}

public class HashCodeEqualsTrap {

    public static void main(String[] args) {
        Map<MyKey, String> map = new HashMap<>();

        MyKey myKey = new MyKey();
        for (int i = 0; i < 50; i++) {
            map.put(myKey, "value-" + i);
        }
        System.out.println(map.size());
        System.out.println(map.get(myKey));

        int j = 5;
        j = j++;
        System.out.println(j);
        j = ++j;
        System.out.println(j);

    }
}
