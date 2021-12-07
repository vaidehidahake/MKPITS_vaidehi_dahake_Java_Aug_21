import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetadataExample {
    public static void main(String args[]) throws Exception {
        //Registering the Driver
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        //Getting the connection
//        String mysqlUrl = "jdbc:mysql://localhost/TestDB";
//        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
//        System.out.println("Connection established......");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov","root","");
        // System.out.println("successfully connected");
        //Statement stmt=con.createStatement();
        //Creating a Statement object
        Statement stmt = con.createStatement();
        //Retrieving the data
        ResultSet rs = stmt.executeQuery("select * from users");
        ResultSetMetaData rsMetaData = rs.getMetaData();
        //Number of columns
        System.out.println("Number of columns: "+rsMetaData.getColumnCount());
        //Column label
        System.out.println("Column Label: "+rsMetaData.getColumnLabel(1));
        //Column name
        System.out.println("Column Name: "+rsMetaData.getColumnName(1));
        //Number of columns
        System.out.println("Table Name: "+rsMetaData.getTableName(1));
    }
}



