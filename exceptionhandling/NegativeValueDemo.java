package exceptionhandling;

class ICICI {
    double amount = 5000;

    void penaltyCharges(double penaltyCharges) {
        amount -= penaltyCharges;
        System.out.println("Balance " + amount);
    }

    void withdraw(double withdrawAmount) throws NegativeValueBalanceException {
        if (amount < withdrawAmount) {
            throw new NegativeValueBalanceException("Insufficient Balance");
        } else {
            amount -= withdrawAmount;
            System.out.println("Remaining Balance " + amount);
        }
    }
}

public class NegativeValueDemo {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        icici.penaltyCharges(1000);
        try {
            icici.withdraw(1000);
        } catch (NegativeValueBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
