package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException,ClassNotFoundException,Exception {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings","root","S@lim1234");
	addRecord(con);
		deleteRecord(con);
		updateRecord(con);
		fetchtheRecord(con);
		
		
		//System.out.println("connection succesfully");
		
		con.close();

	}
	
	public static void addRecord(Connection con) throws SQLException {
		if (con !=null) {
			String s = "insert into student values(30,'deep','pune')";
			Statement st = con.createStatement();
			
			st.executeUpdate(s);
			
	System.out.println("add successfully");
	
			
		}
		else {
			System.out.println("connection failed");
			
		}
	}
public static void deleteRecord(Connection con) throws SQLException{
	if(con !=null) {
		String s = "delete from student where id =14";
		Statement st = con.createStatement();
		System.out.println("record delete successfully");
		
		st.execute(s);
		
	}
	else {
		System.out.println("connection failed");
		
		
	}
	
}
public static void updateRecord(Connection con) throws SQLException{
	if(con !=null) {
		String s = "update student set id=25 where id=18";
		Statement st = con.createStatement();
		
		st.executeUpdate(s);
		System.out.println("update successfully");
		
	}
	else {
		System.out.println("connection failed");
		
	}
	
}
public static void fetchtheRecord(Connection con) throws SQLException{
	if(con !=null) {
		String s = "select * from student where id=13";
		Statement st = con.createStatement();
		
	ResultSet rs =  st.executeQuery(s);
	rs.next();
		System.out.println(rs.getInt(1)+"   " + rs.getString(2) +"  "+ rs.getString(3));
	
	}
	
}

}

