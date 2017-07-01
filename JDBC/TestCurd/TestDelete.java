import java.sql.*;
import java.util.*;
public class TestDelete{
	public static void main(String... args){
		try{
			System.setProperty("jdbc.driver","oracle.jdbc.driver.OracleDriver");
			Properties p=new Properties();
			p.put("user","system");
			p.put("password","sunny");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",p);
			String a1="1001";
			Statement s=c.createStatement();
			int a=s.executeUpdate("delete from emp where salary="+a1);
			System.out.println(a);
			ResultSet rs=s.executeQuery("select *from emp");
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}catch(SQLException e){
			System.out.println(e);
		}
	}
}
