
package ui;

import javax.swing.*;
import dao.ExpenseDAO;
import model.Expense;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class ExpenseGUI extends JFrame {
    JTextField cat, amt, date;
    JTextArea display;
    ExpenseDAO dao=new ExpenseDAO();

    public ExpenseGUI(){
        setTitle("Expense Tracker GUI");
        setSize(500,500);
        setLayout(new FlowLayout());

        cat=new JTextField(10);
        amt=new JTextField(10);
        date=new JTextField(10);
        display=new JTextArea(20,40);

        add(new JLabel("Category"));
        add(cat);
        add(new JLabel("Amount"));
        add(amt);
        add(new JLabel("Date"));
        add(date);

        JButton addBtn=new JButton("Add");
        JButton showBtn=new JButton("Show All");

        add(addBtn);
        add(showBtn);
        add(new JScrollPane(display));

        addBtn.addActionListener(e->{
            try{
                dao.addExpense(new Expense(0,cat.getText(),Double.parseDouble(amt.getText()),date.getText()));
                display.append("Added!\n");
            }catch(Exception ex){display.append("Err:"+ex); }
        });

        showBtn.addActionListener(e->{
            try{
                List<Expense> list=dao.getAll();
                display.setText("");
                for(Expense ex:list){
                    display.append(ex.getId()+" "+ex.getCategory()+" "+ex.getAmount()+" "+ex.getDate()+"\n");
                }
            }catch(Exception ex){display.append("Err:"+ex); }
        });
    }
}
