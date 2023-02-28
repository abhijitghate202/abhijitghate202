package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Class A ", 50);
        map.put("Class B ", 50);
        map.put("Class C ", 50);
        map.put("Class D ", 50);
        map.put("Class B ", 70);
        map.put(null, 50);
        map.put(null, 100);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }
    }
}
