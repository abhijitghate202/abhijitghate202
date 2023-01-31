package multithreading;

public class PrintTable {
    void printTable(int no) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(no * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread1 extends Thread {
    PrintTable printable;

    Thread1(PrintTable printable) {
        this.printable = printable;

    }

    @Override
    public void run() {
        printable.printTable(4);
    }
}

class Thread2 extends Thread {
    PrintTable printTable;

    Thread2(PrintTable printTable) {
        this.printTable = printTable;
    }

    @Override
    public void run() {
        printTable.printTable(10);
    }
}

class PrintTableImpl {
    public static void main(String[] args) {
        PrintTable printTable = new PrintTable();
        Thread1 thread1 = new Thread1(printTable);
        Thread2 thread2 = new Thread2(printTable);
        thread1.start();
        thread2.start();
    }
}