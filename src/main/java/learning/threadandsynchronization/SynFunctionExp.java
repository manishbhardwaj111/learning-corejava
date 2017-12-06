package learning.threadandsynchronization;

public class SynFunctionExp extends Thread{

	private PrintSeries ps;
	
	public void run() {
		ps.printNumber();		
	}
	
	public static void main(String[] args) {
		PrintSeries ps = new PrintSeries();
		SynFunctionExp thread1= new SynFunctionExp();
		SynFunctionExp thread2= new SynFunctionExp();
		thread1.ps=ps;
		thread2.ps=ps;
		
		thread1.start();
		thread2.start();
	}
}


class PrintSeries{
	private static int i=1;
	
	synchronized void printNumber(){
		for(int k=0;k<20;k++){
			System.out.println(Thread.currentThread().getName()+"=="+i++);
			try{Thread.sleep(300);}catch(Exception ex){ex.printStackTrace();}	
		}
	}
}