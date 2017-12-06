package learning.threadandsynchronization.threadpool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyThreadPool {

	private Queue<Runnable> waiting_thread;
	private List<PoolThread> pool_thread;

	public MyThreadPool(int pooolsize) {
		waiting_thread = new LinkedList();
		for (int i = 0; i < pooolsize; i++) {
			pool_thread.add(new PoolThread("" + i));
		}
	}

}

class PoolThread extends Thread {

	enum MyThreadState {
		NEW_STATE, WAIT_STATE, RUNNABLE_STATE, RUNNING_STATE;
	}

	private MyThreadState current_state = MyThreadState.NEW_STATE;

	public PoolThread(String name) {
		super("pool-1-thread-" + name);
	}

	public void run() {

	}
}