import java.sql.*;
public class Callable
{
    static final String QUERY = "{call get em_name (?, ?)}";
    public static void main(String[] arg)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
            // System.out.println("successfully connected");
            CallableStatement stmt=con.prepareCall(QUERY);
              //binding parameters
            stmt.setInt(1,7);
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.execute();
            String em_name=stmt.getString(2);
            System.out.println("em_name name for em_no 102 is " + em_name);
        }catch (Exception ee) {

        }
    }
}

