package jdbcAssingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo2 {
	
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Aniket@123");
			//System.out.println(con);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from accounts");
			while(rs.next())
			{
				System.out.println(rs.getInt("acc_no"));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
	}

}
