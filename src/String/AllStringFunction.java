package String;

public class AllStringFunction {

	public static void main(String[] args) {
String sentence="java is beautiful lang.";
		
		System.out.println(sentence);
		int l=sentence.length();
		int  i=sentence.indexOf("is");
		
		String  lower=sentence.toLowerCase();
		String  upper=sentence.toUpperCase();
		int position=sentence.indexOf("lang");
		
		int d=sentence.indexOf("be");
		String r=sentence.replace('a','i');
		
		System.out.println(+l);
		System.out.println(i);
	
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(+d);
		System.out.println(r);
		System.out.println("The \"java\" best"  +position);



	}

}
