package Collections;


import java.util.LinkedList;

class Emp {
    Integer empId;
    String name;
    String mobile;
}

public class EmpImpl {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(986);
        list.add(456);
        list.add(258);
        list.add(986);
        list.add(986);
        list.add(456);
        System.out.println(list);


    }
}
/*
/list 1
 1  A   986
 2  B   456
 3  C   258
 4  D   986

 5  A   986
 6  B   456
 */
