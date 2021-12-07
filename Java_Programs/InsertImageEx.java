import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.io.*;

public class InsertImageEx {
    public static void main(String args[]) throws Exception {
    //Registering the Driver
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/26_nov", "root", "");
        System.out.println("Connection established......");
        File file=new File("G:\\triangleup.png");
        FileInputStream fis=new FileInputStream(file);
        PreparedStatement ps=con.prepareStatement("insert into pictures(name,image) values(?,?)");
        ps.setString(1,"triangleup");
        ps.setBinaryStream(2,fis,(int)file.length());
        ps.executeUpdate();
        System.out.println("image saved in database successfully");
    } catch (Exception ee) {
        System.out.println(ee.toString());
    }
}

}
