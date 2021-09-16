package jdbcAssingment;

import java.sql.*;

public class jdbcdemo1 {

		public static final String driverName="com.mysql.cj.jdbc.Driver";
		public static final String url="jdbc:mysql://localhost:3306/banking";
		public static final String userName="root";
		public static final String passWord="Aniket@123";
		
		public static void main(String args[])
		{
			Connection con =null;
			PreparedStatement ps =null;
			ResultSet rs =null;
			try
			{
				Class.forName(driverName);
				con=DriverManager.getConnection(url,userName,passWord);
				  ps=con.prepareStatement("select * from accounts");
				rs=ps.executeQuery();
				System.out.println(con);
				while(rs.next()) {
					System.out.println(rs.getInt("acc_no"));
				}
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			finally
			{
				try
				{
					if(rs!=null)
					{
						ps.close();
					}
				
				
				
			}catch(SQLException  e)
			{
				e.printStackTrace();
			}
			
			
			
			
		}
}
}
