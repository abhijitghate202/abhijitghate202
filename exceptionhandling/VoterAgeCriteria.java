package exceptionhandling;

import java.util.Scanner;

public class VoterAgeCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer age = sc.nextInt();
        if (age < 18) {
            throw new ArrayIndexOutOfBoundsException("Not Eligible");
        } else {
            System.out.println("Eligible");
            try {
                if (age < 18) {
                    throw new VoterAgeCriteriaException("Not Eligible");
                } else {
                    System.out.println("You are Eligible");
                }
            } catch (VoterAgeCriteriaException e) {
                System.out.println("in Catch Block");
                System.out.println(e.getMessage());
            }
            System.out.println("Remaining Code");
        }
    }
}
