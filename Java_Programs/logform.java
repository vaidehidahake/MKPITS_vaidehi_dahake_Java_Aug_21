import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
public class logform extends JFrame
{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    logform()
    {
        l1 = new JLabel("username ");
        l1.setBounds(20, 50, 100, 20);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(130, 50, 100, 20);
        add(t1);

        l2 = new JLabel("password ");
        l2.setBounds(20, 100, 100, 20);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(130, 100, 100, 20);
        add(t2);

        b1 = new JButton("login");
        b1.setBounds(20, 130, 80, 25);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stmt=con.createStatement();
                    String qr="select * from logform  where username = '"+t1.getText()+"' and pwd='"+t2.getText()+"' ";
                    ResultSet rs= stmt.executeQuery(qr);
                    int flag=0;
                    while(rs.next())
                    {
                        flag=1;

                    }
                    if(flag==0)
                    {
                        l3.setText("invalid credentials");
                    }
                    else
                    {
                        l3.setText("login successfull");
                    }
                    con.close();
                }catch(Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        l3=new JLabel("status ");
        l3.setBounds(20,170,250,20);
        add(l3);

        setLayout(null);
        setSize(450,300);
        setVisible((true));

    }
    public static  void main(String[] arg)
    {
        logform l=new logform();
    }
}
