import java.sql.*;
public class jpr3 {
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            Statement stat=con.createStatement();
            String qr="select * from student";
            ResultSet rs=stat.executeQuery(qr);
            while(rs.next())
            {
                System.out.println("rollno"+ rs.getInt(1)+"name"+rs.getString(2)+"address"+ rs.getString(3));
            }
            con.close();
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
        System.out.println("connected successfully");
    }

}
