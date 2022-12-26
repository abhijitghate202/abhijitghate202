package exceptionhandling;

public class ExceptionPropagationDemo {
    void m1() {
        System.out.println("in m1");
        int no = 90 / 0;
    }

    void m2() {
        System.out.println("in m2");
        m1();
    }

    void m3() {
        System.out.println("in m3");
        m2();
    }

    void m4() {
        try {
            System.out.println("in m4");
            m3();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

class PropagationImpl {
    public static void main(String[] args) {
        ExceptionPropagationDemo p1 = new ExceptionPropagationDemo();
        p1.m4();
        System.out.println("Remaining Code");
    }
}
