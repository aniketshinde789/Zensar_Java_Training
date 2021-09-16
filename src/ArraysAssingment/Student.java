package ArraysAssingment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
	
		ArrayList<StudentArray> list1=new ArrayList<StudentArray>();
		Scanner sc=new Scanner(System.in);
		int rollNo;
		String name;
		double percentage;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Roll Number,Name,Percentage for student :"+i);
			//name=sc.next();
			rollNo=sc.nextInt();
			name=sc.next();
			percentage=sc.nextDouble();
			
			StudentArray s=new StudentArray(rollNo,name,percentage);
			list1.add(s);
			
			
		
		}
		System.out.println("Student information");
		/*for(int j=0;j<list1.size();j++)
		{
			StudentArray s1=list1.get(j);
			s1.displayStud();
		}*/
		/*for(StudentArray s1:list1)
		{
			s1.displayStud();
		}*/
		Iterator<StudentArray> s2=list1.iterator();
		while(s2.hasNext())
		{
			StudentArray s= s2.next();
			s.displayStud();
		}
		
}

}
