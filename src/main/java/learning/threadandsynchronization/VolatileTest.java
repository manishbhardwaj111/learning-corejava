package learning.threadandsynchronization;

public class VolatileTest {
    private static volatile int VOLATILE_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
    	
    	public ChangeListener() {
    		super("ChangeListener");
    	}
    	@Override
		public void run() {
			try {
				for (int i = 0; i < 100; i++) {

						VOLATILE_INT ++ ;

					System.out.println(Thread.currentThread().getName()+"=="+VOLATILE_INT);
					Thread.sleep(50);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }

	static class ChangeMaker extends Thread {
		public ChangeMaker() {
    		super("ChangeMaker");
    	}
		@Override
		public void run() {
			try {
				for (int i = 0; i < 100; i++) {

						VOLATILE_INT  ++ ;

					System.out.println(Thread.currentThread().getName()+"=="+VOLATILE_INT);
					Thread.sleep(50);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}