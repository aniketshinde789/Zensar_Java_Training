package Class;

import java.util.Scanner;

public class AccContrustor {
	
	
		public long accountno;
		public String customer;
		
		public void details()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter account no");
			accountno=sc.nextInt();
			System.out.println("Enter customer name");
			customer=sc.next();
			
		}
		public void display()
		{
			System.out.println("Account no "+accountno);
			System.out.println("Custormer name "+customer);
		}
		
		public void con()
		{
			
			System.out.println("Default constructor");
			
		}
		public void para()
		{
			System.out.println("I am in parameterized constructor");
			
		}
		public static void main(String args[])
		{
			AccContrustor obj=new AccContrustor();
			obj.details();
			obj.con();
			obj.para();
			
			
			
		}
		
	

}
