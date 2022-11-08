package Polymorphism;

public class Employee {
    void calculateSalary() {
        System.out.println("Salary is 78000");
    }

    static void getBonus() {
        System.out.println("Bonus is 500");
    }
}

class salary extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Salary is 1 Lac");
    }

}

class Programmer extends Employee {
    void calculateSalary() {
        System.out.println("Salary id 100000");
    }


    //getBonus method can not be over-ride because this method is static
}

class EmployeeImpl {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.calculateSalary();
    }
}