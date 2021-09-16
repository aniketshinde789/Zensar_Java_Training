package MultithreadingAssingment;

//performing multiple task in multiple thread
class myTest extends Thread {
	@Override
	public void run() {
		System.out.println("Thread running successfully");
	}
}

class myTest2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Running...");
	}
}

public class Case3 {
	public static void main(String args[]) {
		myTest t1 = new myTest();
		t1.start();

		myTest2 t2 = new myTest2();
		t2.start();
	}

}
