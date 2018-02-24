package learning.threadandsynchronization;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread mt= new MyThread(Thread.currentThread());
		mt.start();
		for(int i=0;i<5;i++) {
			System.out.println("MainThread running");
			Thread.sleep(1000);
		}
	}
}

class MyThread extends Thread{
	
	private Thread mainThread;
	
	public MyThread(Thread mainThread) {
		super();
		this.mainThread=mainThread;
	}
	
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread running");		
	}
}