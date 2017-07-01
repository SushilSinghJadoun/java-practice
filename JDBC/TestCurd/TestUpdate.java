import java.sql.*;
import java.util.*;
public class TestUpdate{
	public static void main(String... args){
		try{
			Driver d=new oracle.jdbc.driver.OracleDriver();
			Properties p=new Properties();
			p.put("user","system");
			p.put("password","sunny");
			Connection c=d.connect("jdbc:oracle:thin:@localhost:1521:xe",p);
			String a1="bmw";
			String a2="1001";
			Statement s=c.createStatement();
			int a3=s.executeUpdate("update emp set name='"+a1+"' where salary="+a2);
			System.out.println(a3);
			ResultSet rs=s.executeQuery("select*from emp");
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}