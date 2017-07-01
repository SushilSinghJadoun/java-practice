import java.sql.*;
class TestInsert{
	public static void main(String... args){
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sunny");
			String s1="abc";
			String s2="101";
			Statement s=c.createStatement();
			int x=s.executeUpdate("insert into emp values('"+s1+"',"+s2+")");
			System.out.println(x);
			ResultSet rs=s.executeQuery("Select*from emp");
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}