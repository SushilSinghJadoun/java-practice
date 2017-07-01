import java.sql.*;
class TestInsertMakeTable{
	public static void main(String... args){
		try{
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sunny");
			String s1="abc";
			String s2="123";
			Statement s=c.createStatement();
			s.executeUpdate("create table emptest(name varchar2(10),id number)");
			int x=s.executeUpdate("insert into emptest values('"+s1+"',"+s2+")");
			System.out.println(x);
			ResultSet rs=s.executeQuery("Select*from emptest");
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}