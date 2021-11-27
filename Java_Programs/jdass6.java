import java.sql.*;
public class jdass6 {
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/15_nov","root","");
            Statement stat= con.createStatement();
            String qr="select * from login";
            ResultSet rs=stat.executeQuery(qr);

            while(rs.next())
            {
                System.out.println("user_id"+rs.getInt(1)+"user_name"+rs.getString(2)+"password"+rs.getString(3));
            }
            con.close();
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
        System.out.println("connected successfully");
    }
}
