import java.sql.*;
public class demo{
    public static void main(String[] args) {
     try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hello", "root","");
         System.out.println("Success");
     } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }
}