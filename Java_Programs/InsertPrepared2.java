import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared2 {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");

            PreparedStatement stmt=con.prepareStatement("delete from em where em_no=?");

            stmt.setInt(1,106);

            int i=stmt.executeUpdate();
            System.out.println(i+" records deleted");

            con.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
