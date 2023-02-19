package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ramesh");
        list.add("vinay");
        list.add("Suresh");

        list.add(2, "Minal");

        list.addFirst("Chikoo");
        list.addLast("Soni");
        list.removeFirst();
        System.out.println("list.get(0)" + list.get(0));
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
