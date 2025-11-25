
package dao;
import db.DBConnection;
import model.Expense;
import java.sql.*;
import java.util.*;

public class ExpenseDAO {
    public void addExpense(Expense e) throws Exception {
        Connection c=DBConnection.getConnection();
        PreparedStatement ps=c.prepareStatement("INSERT INTO expenses(category,amount,date) VALUES (?,?,?)");
        ps.setString(1,e.getCategory());
        ps.setDouble(2,e.getAmount());
        ps.setString(3,e.getDate());
        ps.executeUpdate();
    }

    public List<Expense> getAll() throws Exception{
        List<Expense> list=new ArrayList<>();
        Connection c=DBConnection.getConnection();
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM expenses");
        while(rs.next()){
            list.add(new Expense(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4)));
        }
        return list;
    }
}
