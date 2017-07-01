import java.sql.*;
import java.util.logging.*;
public class TestRetrive{
  public static void main(String[] args){
    try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sunny");
      Statement s=con.createStatement();
      ResultSet rs=s.executeQuery("select * from emp");
      while(rs.next()){
        System.out.println(rs.getString("name"));
        System.out.println(rs.getInt(2));
      }
    }catch(SQLException e){
      System.out.print(e);
    } catch (ClassNotFoundException ex) {
          Logger.getLogger(TestRetrive.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}