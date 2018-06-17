package learning.threadandsynchronization.manishsir;

import java.util.stream.IntStream;

class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread running ");
		IntStream.iterate(0,i->i+2).limit(10000).forEach(System.out::println);
		try {Thread.sleep(5000);}
		catch (InterruptedException e) {
			System.out.println("got interrupted");
		}
	}	
}

public class InterruptedExp1 {
	public static void main(String[] args) {
       MyThread1 mt = new MyThread1();
       mt.start();
       mt.interrupt();
       System.out.println("MainThread1 finish");
	}
}