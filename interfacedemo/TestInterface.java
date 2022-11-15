package interfacedemo;

interface Printable {
    void print();
}

interface Showable {
    void print();
}

class TestInterface implements Printable, Showable {
    public void print() {

        System.out.println("hello world");
    }

    public static void main(String[] args) {
        TestInterface t1 = new TestInterface();
        t1.print();
    }

}
