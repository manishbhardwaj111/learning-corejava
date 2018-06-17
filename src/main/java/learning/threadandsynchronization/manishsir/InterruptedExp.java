package learning.threadandsynchronization.manishsir;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread running ");
		try {Thread.sleep(5000);}
		catch (InterruptedException e) {
			System.out.println("got interrupted");
		}
	}	
}

public class InterruptedExp {
	public static void main(String[] args) {
       MyThread mt = new MyThread();
       mt.start();
       mt.interrupt();
       System.out.println("Main Thread finish");
	}
}