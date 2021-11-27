import java.sql.*;
public class jdass1 {
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            Statement stat= con.createStatement();
            String qr="update  employeees set address='Ahmedabad' where empno=2";
            stat.executeUpdate(qr);
            System.out.println("record saved successfully");
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
        System.out.println("connected successfully");
    }
}
