package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Nilesh");
        map.put(102, "rutik");
        map.put(103, "Pranav");
        map.put(103, "Shubham");
        map.put(null, null);
        map.remove(102);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(" " + entry.getKey() + "  " + entry.getValue());
        }
    }
}
