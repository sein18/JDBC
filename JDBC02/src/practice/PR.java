package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PR {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/multi","root","1234");
		PreparedStatement stm = con.prepareStatement("SELECT *FROM MYTEST WHERE MNO=?");
		stm.setInt(1, 3);
		ResultSet rs = stm.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		}
	}	
}

























