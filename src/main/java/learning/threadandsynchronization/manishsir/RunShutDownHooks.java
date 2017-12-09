package learning.threadandsynchronization.manishsir;

import javax.swing.JFrame;

public class RunShutDownHooks {
	public static void main(String[] s) {
		Runtime runtime = Runtime.getRuntime();
		ShutDownHooks hook = new ShutDownHooks();
		// registering the shut down hook
		runtime.addShutdownHook(new Thread(hook));
		// int x=1/0;
		JFrame frame = new JFrame("Test Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

class ShutDownHooks implements Runnable {
	public void run() {
		System.out.println("***Shutdown Hook up****");
		System.out.println("***Check down Hook up****");
		try {
			Thread.sleep(1000 * 5);
		} catch (Exception e) {
		}
	}
}