package jdbcAssingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class jdbcdemo3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306:/banking","root","Aniket@123");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from accounts");
			while(rs.next()) {
				System.out.println(rs.getInt("acc_no"));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
