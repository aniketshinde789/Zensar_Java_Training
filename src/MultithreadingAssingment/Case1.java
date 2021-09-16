package MultithreadingAssingment;

//performing  single task from single thread

class test extends Thread {
	@Override
	public void run() {
		System.out.println("Task1");

	}
}

public class Case1 {
	public static void main(String args[]) {
		test t1 = new test(); // Creating thread
		t1.start();
	}

}
