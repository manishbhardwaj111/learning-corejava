package learning.threadandsynchronization;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {

	private final BlockingQueue<String> queue;
	
	private int count=1;

	Producer(BlockingQueue<String> q) {
		queue = q;
	}

	public void run() {
		try {
			int i = 0;
			while (i++ < 501) {
				String x= produce();
				queue.put(x);
				System.out.println("Produce "+x);
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	private String produce() {
		return "" + count++;
	}
}

class Consumer implements Runnable {

	private final BlockingQueue<String> queue;

	Consumer(BlockingQueue<String> q) {
		queue = q;
	}

	public void run() {
		try {
			int i = 0;
			while (i++ < 251) {
				consume(queue.take());
				//Thread.sleep(100);
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	private void consume(String x) {
		System.out.println("Consume "+x);
	}
}

public class ProdConsWithBlockingQueue {
	public static void main(String[] uiuiu) {
		BlockingQueue<String> q = new LinkedBlockingQueue<String>();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		Consumer c1 = new Consumer(q);
		new Thread(p).start();
		new Thread(c).start();
		new Thread(c1).start();
	}
}
