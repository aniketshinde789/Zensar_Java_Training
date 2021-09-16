package LoopsProgram;

import java.util.Scanner;

public class PalindromeCount {

	public static void main(String[] args) {
		 int num,rem,sum=0,i,temp;
		 Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		 
		
		 for(i=100;i<=num;i++)
		 {
			 temp=num;
			 while(num>0)
			 {
				 rem=num%10;
				 sum=(sum*10)+rem;
				 num=num/10;
				
			 }
			 if(temp==sum)
			 {
				 System.out.print("The number is:" +num);
			 }
			 sum=0;
			 
			 
		 }
			
		 
	}
			 
				 
			 
		 
				 

 }


