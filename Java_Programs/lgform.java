import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class lgform extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;

    lgform()
    {
        l1=new JLabel("username");
        l1.setBounds(20,50,100,20);
        add(l1);
        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        add(t1);
        l2=new JLabel("password");
        l2.setBounds(20,100,100,20);
        add(l2);
        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        add(t2);
        b1=new JButton("Save");
        b1.setBounds(20,130,80,25);
        b1.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {
                                     try
                                     {
                                         Class.forName("com.mysql.jdbc.Driver");
                                         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                                         Statement stat=con.createStatement();
                                         String qr="insert into logform(username,pwd) values ('"+t1.getText()+"','"+t2.getText()+"')";
                                         stat.executeUpdate(qr);
                                         con.close();
                                         l3.setText("record saved");
                                     }catch (Exception ee)
                                     {
                                         System.out.println(ee.toString());
                                     }
                                 }
                             }
        );
        add(b1);
        b2=new JButton("update");
        b2.setBounds(110,130,80,25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stat=con.createStatement();
                    String qr="update logform set pwd = '"+t2.getText()+"' where username ='"+t1.getText()+"' ";
                    stat.executeUpdate(qr);
                    con.close();
                    l3.setText("record updated");

                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);
        b3=new JButton("delete");
        b3.setBounds(220,130,80,25);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stat=con.createStatement();
                    String qr="delete from logform where username='"+t1.getText()+"'";
                    stat.executeUpdate(qr);
                    con.close();
                    l3.setText("record deleted");

                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }



            }
        });
        add(b3);
        b4=new JButton("search");
        b4.setBounds(330,130,80,25);
        b4.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {
                                     try {
                                         Class.forName("com.mysql.jdbc.Driver");
                                         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                                         Statement stat=con.createStatement();
                                         String qr="select * from  logform where username='"+t1.getText()+"'";
                                         ResultSet rs=stat.executeQuery(qr);
                                         int flag=0;
                                         while (rs.next())
                                         {
                                             flag=1;
                                             t2.setText(rs.getString(3));
                                         }
                                         if (flag==0)
                                         {
                                             l3.setText("no record found");
                                         }

                                         else
                                         {

                                             l3.setText("record found");
                                         }
                                         con.close();

                                     }catch (Exception ee)
                                     {
                                         System.out.println(ee.toString());
                                     }
                                 }
                             }
        );
        add(b4);
        l3=new JLabel("status");
        l3.setBounds(20,170,250,20);
        add(l3);
        setSize(450,300);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String arg[])
    {
        lgform l=new lgform();
    }


}
