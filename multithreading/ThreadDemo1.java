package multithreading;

public class ThreadDemo1 extends Thread{

    @Override
    public void run(){
        System.out.println("In run method");
    }
}
class ThreadDemoImpl1{
    public static void main(String[] args) {
        ThreadDemo1 th1 = new ThreadDemo1();//Born /new
        System.out.println("in main method");
        th1.start();//runnable
    }
}
