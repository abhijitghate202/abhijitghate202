package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> fruits = new ArrayDeque<>();
        fruits.add("Apple");
        fruits.add("grapes");
        fruits.add("strawberry");
        fruits.add("Oranges");
        fruits.add("Pomegranate");
        fruits.add("Mango");
        //fruits.removeFirst();
        //fruits.pollFirst();
        fruits.removeLast();
        //fruits.pollLast();
        //fruits.getFirst();
        //fruits.peekFirst();
        //fruits.getLast();
        //fruits.peekLast();
        for (String s : fruits) {
            System.out.println(s);
        }

    }
}
