public class MyExamThread extends Thread {
	private int mark;
	
	MyExamThread(int m) { 
		mark = m; 
	}
	
	public void run() {
//		try {
//			Thread.sleep(5000);			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		// here above we force thread to sleep for 5 seconds, since it might raise an exception we catch it
		
		if (mark > 55)
			System.out.println("Exam is passed!");
		System.out.println(getClass().getName() + " exits....");
	}
	
	public static void main(String args[]) {
		(new MyExamThread(75)).start();
		System.out.println("main exits....");
	} 
}
