package multithreading;

public class MovieTicket {
    static int totalTickets = 10;

    static synchronized void bookTicket(int seats) {
        if (totalTickets >= seats) {
            System.out.println(seats + " seats are going to book");
            totalTickets = totalTickets - seats;
            System.out.println("Ticket left " + totalTickets);
        } else {
            System.out.println("No Tickets available");
        }
    }
}

class MyThread1 extends Thread {
    int seats;
    MovieTicket movieTicket;

    MyThread1(int seats, MovieTicket movieTicket) {
        this.movieTicket = movieTicket;
        this.seats = seats;
    }

    @Override
    public void run() {
        movieTicket.bookTicket(seats);
    }
}

class MyThread2 extends Thread {
    int seats;
    MovieTicket movieTicket;

    MyThread2(int seats, MovieTicket movieTicket) {
        this.movieTicket = movieTicket;
        this.seats = seats;
    }

    @Override
    public void run() {
        movieTicket.bookTicket(seats);
    }
}

class MovieTicketsImpl {
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        MovieTicket m2 = new MovieTicket();

        MyThread1 t1 = new MyThread1(4, m1);
        t1.start();
        MyThread1 t2 = new MyThread1(2, m2);
        t2.start();
        MyThread1 t3 = new MyThread1(1, m1);
        t3.start();
        MyThread1 t4 = new MyThread1(5, m2);
        t4.start();

    }
}