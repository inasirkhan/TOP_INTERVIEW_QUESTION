package top150.arraystrings;

import java.util.*;

public class RandomizedSet {

        List<Integer> list = null;
        Map<Integer, Integer> map = null;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            Integer idx = map.get(val);
            Collections.swap(list, idx, list.size()-1);
            Integer swappedWith = list.get(idx);
            map.put(swappedWith,idx);
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }

        public int getRandom() {
            Random random = new Random();
            int i = random.nextInt(list.size());
            return list.get(i);
        }
}
