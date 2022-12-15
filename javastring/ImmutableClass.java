package javastring;

final class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Customer customer = new Customer("Abhijit");
        System.out.println(customer.getName());
    }
}
