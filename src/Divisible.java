import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		int Number;
		Scanner no=new Scanner(System.in);
		Number=no.nextInt();
		if(Number%5==0 || Number%11==0 )
		{
			System.out.println("It is divisible");
		}
		else
		{
			System.out.println("Not divisible");
		}

	}

}
