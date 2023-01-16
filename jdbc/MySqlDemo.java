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
}
