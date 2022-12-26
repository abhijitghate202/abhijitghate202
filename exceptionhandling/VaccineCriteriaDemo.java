package exceptionhandling;

import java.util.Scanner;

public class VaccineCriteriaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer age = sc.nextInt();
        if (age < 60) {
            throw new ArithmeticException("Not Eligible");
        } else {
            System.out.println("Eligible");
            try {
                if (age < 60) {
                    throw new VaccineCriteriaException("Not Eligible");
                } else {
                    System.out.println("You are eligible");
                }
            } catch (VaccineCriteriaException e) {
                System.out.println("in catch block");
                System.out.println(e.getMessage());
            }
            System.out.println("Remaining code");
        }
    }}
