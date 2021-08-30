import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		Double a,b,result;
		

		Scanner input= new Scanner(System.in);
		System.out.println("Choose an operator");
		operator = input.next().charAt(0);
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		switch (operator)
		{
		case '+':
		result=a+b;
		System.out.println( a+b + "result");
		break;
		
		case '-':
			result=a-b;
			System.out.println( a-b + "result");
			break;
			
		case '*':
			result=a*b;
			System.out.println( a*b + "result");
			break;
			
		case '/':
			result=a/b;
			System.out.println( a/b + "result");
			break;
			
			
		default:
			System.out.println("Invalid Operator");
			break;
		
		}
		


	}

}
