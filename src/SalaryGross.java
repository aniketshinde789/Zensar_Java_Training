import java.util.Scanner;

public class SalaryGross {

	public static void main(String[] args) {
		double basic,hra,da,gross;
		Scanner sc=new Scanner(System.in);
		basic=sc.nextDouble();
		
		if(basic<=10000)
		{
			hra=basic*0.2;
			da=basic*0.8;
		}
		else if(basic<=20000)
		{
			hra=basic*0.25;
			da=basic*0.9;
		}
		else
		{
			hra=basic*0.3;
			da=basic*0.95;
		}
		
		gross=basic+da+hra;
		System.out.println("The Gross Salary is:" + gross);



	}

}
