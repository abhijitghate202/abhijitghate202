package multithreading;

public class ThreadPriorityDemo extends Thread {
    @Override
    public void run() {
        System.out.println("In run Method");
    }
}

class ThreadPriorityImpl {
    public static void main(String[] args) {
        ThreadPriorityDemo th1 = new ThreadPriorityDemo();
        ThreadPriorityDemo th2 = new ThreadPriorityDemo();
        ThreadPriorityDemo th3 = new ThreadPriorityDemo();
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        System.out.println("Priority " + th1.getPriority());
        System.out.println("Priority " + th2.getPriority());
        System.out.println("Priority " + th3.getPriority());

    }
}