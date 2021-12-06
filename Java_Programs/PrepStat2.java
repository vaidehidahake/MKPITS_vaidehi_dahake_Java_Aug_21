import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class PrepStat2 extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;
    PrepStat2()
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
        t2=new JPasswordField();
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
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
                    PreparedStatement psat= con.prepareStatement("insert into users(username,pwd) values(?,?)");
                    psat.setString(1,t1.getText());
                    psat.setString(2,t2.getText());
                    int r=psat.executeUpdate();
                    con.close();
                    l3.setText("record saved");
                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);
        b2=new JButton("update");
        b2.setBounds(115,130,80,25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
                    PreparedStatement psat= con.prepareStatement("update users set pwd=? where username=?");
                    String u=t1.getText();
                    String p=t2.getText();
                    psat.setString(1,p);
                    psat.setString(2,u);
                    int i=psat.executeUpdate();
                    System.out.println(i+"records updated");
                    con.close();

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
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
                    PreparedStatement psat= con.prepareStatement("delete from users where username=?");
                    String u=t1.getText();

                    psat.setString(1,u);

                    int i=psat.executeUpdate();
                    System.out.println(i+"records deleted");
                    con.close();

                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }

            }
        });
        add(b3);
        b4=new JButton("Search");
        b4.setBounds(320,130,80,25);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
                    PreparedStatement psat= con.prepareStatement("Select * from users  where username=?");
                    String u=t1.getText();

                    psat.setString(1,u);
                    ResultSet rs= psat.executeQuery();
                    int flag=0;
                    while (rs.next())
                    {
                        l3.setText("record found");
                        flag=1;
                        t2.setText(rs.getString(2));
                    }
                    if (flag==0)
                    {
                        t2.setText("");
                        l3.setText("no record found");
                    }
                    con.close();

                }catch (Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);
        l3=new JLabel("Status");
        l3.setBounds(20,170,250,20);
        add(l3);
        setLayout(null);
        setSize(450,300);
        setVisible(true);


    }
    public static void main(String arg[])
    {
        PrepStat2 p=new PrepStat2();
    }


}
