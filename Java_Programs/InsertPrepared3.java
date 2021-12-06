import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertPrepared3 {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");

            PreparedStatement stmt=con.prepareStatement("Select * from em");
            ResultSet rs= stmt.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+""+rs.getString(2));

            }


            con.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
