package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MySqlUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java7sep";
        String username = "root";
        String password = "Captainamerica202@";
        String updateQuery = "update student set class = 'BE' where name = 'abhijit';";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = con.prepareStatement(updateQuery);
            int n = preparedStatement.executeUpdate();
            System.out.println(n + " row/s updated");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
