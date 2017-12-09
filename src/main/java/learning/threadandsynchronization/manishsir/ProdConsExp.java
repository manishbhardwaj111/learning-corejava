package learning.threadandsynchronization.manishsir;

public class ProdConsExp {
	public static void main(String[] s) {
		Transact st = new Transact();
		ThreadA t1 = new ThreadA(st, "One");
		ThreadB t2 = new ThreadB(st, "Two");
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}

class Transact {
	int flag = 0;
	int data = 0;
	synchronized void submit() {
		flag = 1;
		try {Thread.sleep(1000);}catch(Exception e) {}
		data = 101;
		System.out.println("Value Submited");
		notify();
	}
	synchronized int withdraw() {
		if (flag == 0) {
			try {System.out.println("Wait Block");wait();}catch (Exception e) {}
		}
		return data;
	}
}

class ThreadA extends Thread {
	Transact s;
	ThreadA(Transact s1, String title) {
		super(title);
		this.s = s1;
	}
	public void run() {
		System.out.println(s.withdraw());
		// s.submit();
	}
}

class ThreadB extends Thread {
	Transact s;
	ThreadB(Transact s1, String title) {
		super(title);
		this.s = s1;
	}
	public void run() {
		s.submit();
		// System.out.println(s.withdraw());
	}
}