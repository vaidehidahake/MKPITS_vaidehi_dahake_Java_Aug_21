import java.sql.*;
public class InsertPrepared {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");

            PreparedStatement stmt=con.prepareStatement("insert into em values(?,?)");
            stmt.setInt(1,107);//1 specifies the first parameter in the query
            stmt.setString(2,"Ratan");

            int i=stmt.executeUpdate();
            System.out.println(i+" records inserted");

            con.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}


