package Class;

public class Studentmain {

	public static void main(String[] args) {
		
		Student obj=new Student();
		System.out.println("public:" +obj.rollno);
		System.out.println("protected:"+obj.admissionno);
		//System.out.println("private :"+obj.courseid);
		System.out.println("default:"+obj.age);
		
		
		obj.dopublic();
		obj.doprotected();
		//obj.private();
		obj.dodefault();
		
		
	}

}
