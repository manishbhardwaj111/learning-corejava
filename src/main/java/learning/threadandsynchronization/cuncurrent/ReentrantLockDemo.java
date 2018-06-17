package learning.threadandsynchronization.cuncurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {
	
	static ReentrantLock lock = new ReentrantLock();
	
	public MyThread(String name) {
	   super(name);
	}
	
	@Override
	public void run() {
		do {
			try {
				if(lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
					//ExecutorService
					System.out.println(Thread.currentThread().getName() + "---- get lock");
                    Thread.sleep(30000);
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + "---- release lock");
                    break;
				}else {
					System.out.println(Thread.currentThread().getName() + "---- unable to get lock will try again" );
				}
			}catch(Exception exp) {
				
			}
			
		}while(true);
	}
	
}

public class ReentrantLockDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread("First Thread");
		MyThread mt2 = new MyThread("Second Thread");
		mt.start();
		mt2.start();
	}

}
