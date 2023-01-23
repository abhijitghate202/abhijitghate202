package jdbc;
import java.sql.*;

/**
 * mysql> create procedure getEmployeeByNameAndCity(IN nm varchar(10),IN c varchar(10))
 * begin
 * select * from employee where name = nm and city = c;
 * end;
 * /
 */

public class MySqlProcedureInParam {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/java7sep";
        String username = "root";
        String password = "Captainamerica202@";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        CallableStatement cs = con.prepareCall("{call getEmployeeByNameAndCity(?,?)}");
        cs.setString(1, "Rahul");
        cs.setString(2, "Banglore");
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
        }
        con.close();


    }
}
