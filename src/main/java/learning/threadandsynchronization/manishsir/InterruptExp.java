package learning.threadandsynchronization.manishsir;

public class InterruptExp {
	public static void main(String[] s) {
		ThreadOne t1 = new ThreadOne("ThreadOne");
		ThreadTwo t2 = new ThreadTwo("ThreadTwo", t1);
		t1.setPriority(10);
		t1.start();
		t2.start();
	}
}

class ThreadOne extends Thread {
	ThreadOne(String s) {
		super(s);
		// start();
	}

	public void run() {
		System.out.println(getName());
		try {Thread.sleep(600000000);} catch (Exception e) {System.out.println("interrupted t1 == "+e);}
		System.out.println(getName() + " Dead");
	}
}

class ThreadTwo extends Thread {
	ThreadOne t1;

	ThreadTwo(String s, ThreadOne t1) {
		super(s);
		// start();
		this.t1 = t1;
	}

	public void run() {
		System.out.println(getName());
		t1.interrupt();
		try {Thread.sleep(3000);} catch (Exception e) {System.out.println(e);}
		System.out.println(getName() + " Dead");
	}
}