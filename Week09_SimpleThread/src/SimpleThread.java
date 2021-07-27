public class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);		// passes string to super class (Thread)
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " " + getName());
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("DONE! " + getName());
	}
	
	public static void main (String[] args) {
		Thread t1 = new SimpleThread("First");
		t1.start();
		Thread t2 = new SimpleThread("Second");
		t2.start();
		// here above we have created two Threads and then started them
		// remember it is out of our control which one comes first or second
		
		
		try {
			t1.join(1000);		// wait for t1 to join, by at most one second; else it (main) will continue
			t2.join();					// ignoring above line, this makes main thread have to wait for t2 to join
										// before it can continue; so main will finish only after second thread finishes
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("DONE ALL!");
	}
}