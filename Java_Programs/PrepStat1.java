import java.sql.*;

public class PrepStat1 {
    public static void main(String arg[])
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
           PreparedStatement psat= con.prepareStatement("insert into flower values(?,?)");
           psat.setInt(1,1);
           psat.setString(2,"Jasmine");
            psat.setInt(1,2);
            psat.setString(2,"Rose");
            psat.setInt(1,3);
            psat.setString(2,"Sunflower");
           int res= psat.executeUpdate();
           System.out.println("record saved");
        }catch (Exception ee)
        {
            System.out.println(ee.toString());
        }
    }

}
