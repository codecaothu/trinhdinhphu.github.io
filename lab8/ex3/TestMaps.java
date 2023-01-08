package lab8.ex3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static lab8.ex3.Maps.count;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);
        map.put(7, 8);
        System.out.println(count(map));
        System.out.println(Maps.contains(map, 3));
        System.out.println(Maps.contains(map, 0));
        System.out.println(Maps.containsKeyValue(map, 1, 2));
        System.out.println(Maps.containsKeyValue(map, 1, 7));
        System.out.println(Maps.keySet(map));
        System.out.println(Maps.values(map));
        System.out.println(Maps.getColor(1));
        Maps.empty(map);
        System.out.println(count(map));
    }
}
