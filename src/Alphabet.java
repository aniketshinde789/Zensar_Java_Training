import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch;
		ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch + "is a Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch + "Is a digit.");
		}
		else
		{
			System.out.println( ch + "is A Special Character");
		}
		

	}

}
