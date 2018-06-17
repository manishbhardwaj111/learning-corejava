package learning.threadandsynchronization;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerProblem {
	
	static Queue<Integer> buffer;
	final static int MAX_SIZE=100;
	static int MAX_ITERATION=0;

	public static void main(String[] args) {
		
		buffer = new LinkedList<Integer>();
		ConsumerThread c= new ConsumerThread(buffer, MAX_SIZE);
		ProducerThread p= new ProducerThread(buffer, MAX_SIZE);
		Thread ct = new Thread(c,c.getClass().getName());
		Thread pt = new Thread(p,p.getClass().getName());
		ct.start();
		pt.start();
		
	}
}

class ConsumerThread implements Runnable {

	Queue<Integer> buffer;
	int MAX_SIZE;

	public ConsumerThread(Queue<Integer> buffer, int MAX_SIZE) {
		this.buffer = buffer;
		this.MAX_SIZE = MAX_SIZE;
	}

	public void run() {
		while (ProducerConsumerProblem.MAX_ITERATION++ <= 100) {
			synchronized (buffer) {
				if (0 == buffer.size()) {
					try {
						System.out.println("Queue is empty," + "Consumer thread is waiting" + " for producer thread to put something in queue = "+buffer.toString());
						buffer.wait();
					} catch (InterruptedException e) {
						System.out.println("got interrrupted");
					}
				}
				System.out.println("Consumed item : " + buffer.remove());
				buffer.notifyAll();
			}
		}
	}

}

class ProducerThread implements Runnable {

	Queue<Integer> buffer;
	int MAX_SIZE;

	public ProducerThread(Queue<Integer> buffer, int MAX_SIZE) {
		this.buffer = buffer;
		this.MAX_SIZE = MAX_SIZE;
	}

	public void run() {
		final Random r = new Random(1000);
		while (ProducerConsumerProblem.MAX_ITERATION++ <= 100) {
			synchronized (buffer) {
				if (MAX_SIZE == buffer.size()) {
					try {
						System.out .println("Queue is full, " + "Producer thread waiting for " + "consumer to take something from queue = "+buffer.toString());
						buffer.wait();
					} catch (InterruptedException e) {
						System.out.println("got interrrupted");
					}
				}
				final int item=r.nextInt(100);
				buffer.add(r.nextInt(100));
				System.out.println("Produce item : " + item);
				buffer.notifyAll();
			}
		}

	}
}
