package javastring;

public class ShortName {
    public static void main(String[] args) {
        System.out.println("Enter Your Name : ");
        String str = "Abhijit Mahadev Ghate";
        String names[] = str.split(" ");
        String firstName = names[0].substring(0, 1);
        String middleName = names[1].substring(0, 1);
        String lastName = names[2].substring(0, 1).toUpperCase().concat(names[2].substring(1).toLowerCase());
        String fullName = firstName.toUpperCase() + ". " + middleName.toUpperCase() + ". " + lastName;
        System.out.println(fullName);

    }
}
