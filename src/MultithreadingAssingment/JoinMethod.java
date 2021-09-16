package MultithreadingAssingment;

public class JoinMethod extends Thread {
	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("number" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	
	
		
	

	public static void main(String args[]) throws InterruptedException {
		// Thread mainThraed=Thread.currentThread();

		JoinMethod j = new JoinMethod();
		j.start();
		j.join(); // join() method

		char c;
		for (c = 'a'; c<= 'h'; c++) {
			System.out.println("Main Thread " + c);

		}
	}

}
