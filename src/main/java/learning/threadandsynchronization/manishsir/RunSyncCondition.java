package learning.threadandsynchronization.manishsir;

public class RunSyncCondition {
	public static void main(String[] s) {
		Shared st = new Shared();
		new Thread1(st, "one");
		new Thread2(st, "two");
		new Thread3(st, "three");
	}
}

class Shared {
	int x;
	Temp t = new Temp();

	synchronized void show(String s, int a) {
		x = a;
		System.out.println("Enter in show " + s + "" + x);
		try {Thread.sleep(2000);} catch (Exception e) {}
		System.out.println("Exit from show " + s + "" + x);
	}

	synchronized void show1(String s, int a) {
		x = a;
		System.out.println("Enter in show1 " + s + "" + x);
		try {Thread.sleep(2000);} catch (Exception e) {}
		System.out.println("Exit from show1 " + s + "" + x);
	}

	void show2(String s, int a) {
		System.out.println("Enter in Show2" + s);
		synchronized (this) {
			x = a;
			System.out.println("Enter in block" + s + "" + x);
			try {Thread.sleep(2000);} catch (Exception e) {}
			System.out.println("Exit from block " + s + "" + x);
		}
		System.out.println("Exit from show2 " + s + "" + x);
	}

	void show3(String s, int a) {
		System.out.println("Enter in Show3 " + s);
		synchronized (t) {
			t.dilTohPagalHai(s);	
		}
		System.out.println("Exit from show3 " + s + " " + x);
	}

	synchronized void show4(String s, int a) {
		x = a;
		System.out.println("Enter in show4" + s + "" + x);
		Thread.currentThread().suspend();
		Thread.currentThread().suspend();
		System.out.println("Exit from show4" + s + "" + x);
	}
}

class Temp {
	public void dilTohPagalHai(String s) {
		System.out.println("Enter in DTPH " + s);
		try {Thread.sleep(2000);} catch (Exception e) {}
		System.out.println("Exit from DTPH " + s);
	}
}

class Thread1 extends Thread {
	Shared s;

	public Thread1(Shared s, String str) {
		super(str);
		this.s = s;
		start();
	}

	public void run() {
		s.show3(Thread.currentThread().getName(), 10);
	}
}

class Thread2 extends Thread {
	Shared s;

	public Thread2(Shared s, String str) {
		super(str);
		this.s = s;
		start();
	}

	public void run() {
		s.show3(Thread.currentThread().getName(), 20);
	}
}

class Thread3 extends Thread {
	Shared s;

	public Thread3(Shared s, String str) {
		super(str);
		this.s = s;
		start();
	}

	public void run() {
		s.show3(Thread.currentThread().getName(), 30);
	}
}