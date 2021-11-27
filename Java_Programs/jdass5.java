import java.sql.*;
public class jdass5 {
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/15_nov","root","");
            Statement stat= con.createStatement();
            String qr="delete from  login where user_id=8";
            stat.executeUpdate(qr);
            System.out.println("record saved successfully");
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
        System.out.println("connected successfully");
    }
}
