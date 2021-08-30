import java.util.Scanner;

public class DemostrationAmount {

	public static void main(String[] args) {
		
		int amt;
		Scanner sc=new Scanner(System.in);
		amt=sc.nextInt();
		
		if(amt>99999)
		{
			System.out.println("Invalid Amount");
		}
		else
		{
			int a[]= {2000,500,200,100,50,10,5,2,1};
			int i,p,r,b,t;
			p=amt;
			for(i=0;i<a.length;i++)
			{
				t=amt/a[i];
				if(t!=0)
				{
					System.out.println(a[i]+"X"+t+"="+(t*a[i]));
					amt=amt%a[i];
					
				}
			}
		

		}
	}

}
