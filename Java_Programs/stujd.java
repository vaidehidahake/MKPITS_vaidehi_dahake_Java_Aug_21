import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class stujd extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3,b4;
    stujd()
    {
        l1=new JLabel("rollno");
        l1.setBounds(20,50,100,20);
        add(l1);
        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        add(t1);
        l2=new JLabel("name");
        l2.setBounds(20,100,100,20);
        add(l2);
        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        add(t2);
        l3=new JLabel("address");
        l3.setBounds(20,150,100,20);
        add(l3);
        t3=new JTextField();
        t3.setBounds(130,150,100,20);
        add(t3);
        l4=new JLabel("email");
        l4.setBounds(20,200,100,20);
        add(l4);
        t4=new JTextField();
        t4.setBounds(130,200,100,20);
        add(t4);
        l5=new JLabel("mobileno");
        l5.setBounds(20,250,100,20);
        add(l5);
        t5=new JTextField();
        t5.setBounds(130,250,100,20);
        add(t5);
        b1=new JButton("save");
        b1.setBounds(20,300,80,25);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    Statement stat= con.createStatement();
                    String qr="insert into student(rollno,name,address,email,mobileno) values ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
                        stat.executeUpdate(qr);
                    con.close();
                    l6.setText("record saved");

                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);
        b2=new JButton("update");
        b2.setBounds(110,300,80,25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    Statement stat= con.createStatement();
                    String qr="update student set mobileno='"+t5.getText()+"' where name ='"+t2.getText()+"' ";
                    stat.executeUpdate(qr);
                    con.close();
                    l6.setText("record updated");

                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }

            }
        });
        add(b2);
        b3=new JButton("delete");
        b3.setBounds(200,300,80,25);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    Statement stat= con.createStatement();
                    String qr="delete from student  where rollno ='"+t1.getText()+"' ";
                    stat.executeUpdate(qr);
                    con.close();
                    l6.setText("record deleted");

                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }

            }
        });
        add(b3);
        b4=new JButton("search");
        b4.setBounds(290,300,80,25);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/23_nov","root","");
                    Statement stat= con.createStatement();
                    String qr="select * from student  where rollno='"+t1.getText()+"' ";
                    ResultSet rs=stat.executeQuery(qr);
                    int flag=0;
                    while(rs.next())
                    {
                        flag=1;
                        t5.setText(rs.getString(5));
                    }
                    if (flag==0)
                    {
                        l6.setText("no record found");
                    }
                    else
                    {
                        l6.setText("record found");
                    }
                    con.close();


                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);
        l6=new JLabel("status");
        l6.setBounds(20,350,100,20);
        add(l6);
        setLayout(null);
        setSize(450,300);
        setVisible(true);
    }
    public static void main(String arg[])
    {
        stujd s1=new stujd();
    }
}
