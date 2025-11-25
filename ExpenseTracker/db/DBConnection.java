
package db;
import java.sql.*;

public class DBConnection {
    private static Connection conn;
    public static Connection getConnection() throws Exception{
        if(conn==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/expense_tracker","root","1234");
        }
        return conn;
    }
}
