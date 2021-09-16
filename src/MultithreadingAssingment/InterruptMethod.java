package MultithreadingAssingment;

public class InterruptMethod extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				System.out.println("New Thread Interrupted");
			}
		}
	}

	public static void main(String args[]) {
		InterruptMethod t = new InterruptMethod();
		t.start();
		t.interrupt(); // interrupt method using because thread in slleping condition
	}

}
