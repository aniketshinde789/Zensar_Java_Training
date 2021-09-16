package MultithreadingAssingment;

public class MedicalJoin extends Thread{
	public void run()
	{
		System.out.println("Mediacal start");
		try {
			Thread.sleep(3000);
			System.out.println("Mediacl Completed");
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
}
	class TestDriver extends Thread
	{
		public void run()
		{
			System.out.println("TestDriver is start");
			try {
				Thread.sleep(2500);
				System.out.println("TestDriver is completed");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	class License extends Thread
	{
		public void run()
		{
			System.out.println("Officer take the file");
			try {
				Thread.sleep(2500);
				System.out.println("Successfully done ");
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
class LicenseDemo
	{
		public static void main(String args[]) throws InterruptedException
		{
			MedicalJoin md=new MedicalJoin();
			md.start();
			
			md.join();
			
			TestDriver td=new TestDriver();
			td.start();
			
			td.join();
			
			License l=new License();
			l.start();
			
			
			
			
			
		}
}
	 
	




