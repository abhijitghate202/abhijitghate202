package exceptionhandling;
import java.util.Scanner;
class HDFC {
    double amount = 5000;

    void deposit(double depositAmount) throws InvalidAmountException {
        if (depositAmount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        } else {
            amount += depositAmount;
            System.out.println("Balance: " + amount);
        }
    }
}

public class InvalidAmountDemo {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();

        System.out.println();
        Scanner sc = new Scanner(System.in);
    }
}
