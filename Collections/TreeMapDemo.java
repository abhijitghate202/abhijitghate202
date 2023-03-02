package Collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Double> map = new TreeMap<>();
        map.put("Monika", 98.5);
        map.put("Raju", 91.5);
        map.put("Akshata", 89.6);
        map.put("Sheetal", null);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(" " + entry.getKey() + " " + entry.getValue());
        }
    }
}
