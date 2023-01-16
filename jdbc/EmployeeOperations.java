package jdbc;

import java.sql.*;
import java.util.Scanner;

public class EmployeeOperations {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/java7sep";
        String username = "root";
        String password = "Captainamerica202@";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Scanner sc = new Scanner(System.in);
        int ch;
        PreparedStatement ps = null;
        do {
            System.out.println("Enter Your Choice ");
            System.out.println("1. Insert ");
            System.out.println("2. Update ");
            System.out.println("3. Delete ");
            System.out.println("4. Show All ");
            System.out.println("5. Exit ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    insertStudent(sc, ps, con);
                    break;
                case 2:
                    updateStudent(sc, ps, con);
                    break;
                case 3:
                    deleteStudent(sc, ps, con);
                    break;
                case 4:
                    showAllStudent(sc, ps, con);
                    break;
            }
        } while (ch <= 6);
    }

    private static void showAllStudent(Scanner sc, PreparedStatement ps, Connection con) throws SQLException {
        String showAll = "select * from employee";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(showAll);
        while (rs.next()) {
            System.out.println(" ");
            System.out.print("Id No:" + rs.getInt(1));
            System.out.print("   ");
            System.out.print("Name:" + rs.getString(2));
            System.out.print("   ");
            System.out.print("Age:" + rs.getInt(3));
            System.out.print("   ");
            System.out.print("City:" + rs.getString(4));
            System.out.print("   ");
            System.out.print("Job Role:" + rs.getString(5));
        }

    }

    private static void deleteStudent(Scanner sc, PreparedStatement ps, Connection con) throws SQLException {
        String deleteQuery = "delete from employee where id = ?;";
        ps = con.prepareStatement(deleteQuery);

        System.out.println("Enter id ");
        ps.setInt(1, sc.nextInt());

        int n = ps.executeUpdate();
        System.out.println(n + "row/s affected");
    }

    private static void updateStudent(Scanner sc, PreparedStatement ps, Connection con) throws SQLException {
        String updateQuery = "update employee set city =? where id = ?;";
        ps = con.prepareStatement(updateQuery);

        System.out.println("Enter city ");
        String city = sc.next();
        ps.setString(1, city);

        System.out.println("Enter id ");
        ps.setInt(2, sc.nextInt());

        int n = ps.executeUpdate();
        System.out.println(n + " row/s affected");

    }

    private static void insertStudent(Scanner sc, PreparedStatement ps, Connection con) throws SQLException {
        String insertQuery = "insert into employee values (?,?,?,?,?); ";
        ps = con.prepareStatement(insertQuery);

        System.out.println("Enter Id No ");
        int id = sc.nextInt();
        ps.setInt(1, id);

        System.out.println("Enter Name ");
        String nm = sc.next();
        ps.setString(2, nm);

        System.out.println("Enter Age ");
        int age = sc.nextInt();
        ps.setInt(3, age);

        System.out.println("Enter City ");
        String city = sc.next();
        ps.setString(4, city);

        System.out.println("Enter Process ");
        String process = sc.next();
        ps.setString(5, process);

        int n = ps.executeUpdate();
        System.out.println(n + " row/s affected");

    }
}
