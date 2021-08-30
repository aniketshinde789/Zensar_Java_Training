package Class;

import java.util.Scanner;

public class Account {
	
	private int  accno;
	public int amount=1000;
	private String name;
	private double balance;
	private int amt;
	private double withdraw;
	
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account NO: ");
		accno=sc.nextInt();
		System.out.println("Enter your name :");
		name=sc.next();
		
		
	}
	public void display()
	{
		System.out.println("acc_no "+accno);
		System.out.println("name "+name);
		
		System.out.println("Deposite "+amt);
	
		System.out.println("Balance "+balance);
	
		System.out.println("Withdraw amount"+withdraw);
		
	}
	public void deposit()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter deposit");
		amt=sc.nextInt();
		balance=amount +amt;
		
		
		
	}
	public void withdraw()
	{
		if(balance<withdraw)
		{
			System.out.println("Oops! you account in not suffient balance");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Withdraw Amount");
			
			withdraw=sc.nextInt();
			
			withdraw=balance-withdraw;
		}
	}
	public static void main(String args[])
	{
		Account obj=new Account();
		obj.insert();
		obj.deposit();
		obj.withdraw();
		obj.display();
		
	}
	
}