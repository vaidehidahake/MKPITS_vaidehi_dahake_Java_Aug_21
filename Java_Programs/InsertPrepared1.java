import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared1 {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");

            PreparedStatement stmt=con.prepareStatement("update em set em_name=? where em_no=?");
            stmt.setString(1,"Arya");//1 specifies the first parameter in the query
            stmt.setInt(2,107);

            int i=stmt.executeUpdate();
            System.out.println(i+" records updated");

            con.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
