package jdbc;

import java.sql.*;

public class MySqlDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/java7sep";
        String username = "root";
        String password = "Captainamerica202@";
        String selectAll = "select * from employee";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(selectAll);
        while (rs.next()) {
            System.out.println("Id No : " + rs.getInt(1));
            System.out.println("Name : " + rs.getString(2));
            System.out.println("Age : " + rs.getInt(3));
            System.out.println("City : " + rs.getString(4));
            System.out.println("Job Role : " + rs.getString(5));
        }

    }
}
