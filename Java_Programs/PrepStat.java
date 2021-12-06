import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class PrepStat {
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
            PreparedStatement pst=con.prepareStatement("insert into em values(?,?)");
            pst.setInt(1,101);
            pst.setString(2,"amit");
            pst.setInt(1,102);
            pst.setString(2,"rakhi");
            pst.setInt(1,103);
            pst.setString(2,"bhushan");
            pst.setInt(1,104);
            pst.setString(2,"catherine");
            pst.setInt(1,105);
            pst.setString(2,"devansh");
            pst.setInt(1,106);
            pst.setString(2,"Shriya");
            int res= pst.executeUpdate();
            System.out.println("record saved");
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
    }
}
