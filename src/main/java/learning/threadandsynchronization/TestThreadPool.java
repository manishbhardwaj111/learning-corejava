package learning.threadandsynchronization;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  

class WorkerThread implements Runnable {    
	private String message;  
    
	public WorkerThread(String s){  
        this.message=this.getClass().getSimpleName()+s; 
        System.out.println("Thread Crteated "+s);
    }  
    
	public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start "+this.getClass().getSimpleName()+") message = "+message);  
        try {Thread.sleep(2000);} catch(InterruptedException e) {e.printStackTrace();}
        System.out.println(Thread.currentThread().getName()+" (End "+this.getClass().getSimpleName()+")");//prints thread name  
    }  	
}  

public class TestThreadPool {  
     public static void main(String[] args) {  
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
        	Runnable worker;
            worker = new WorkerThread(" " + i);  
        	executor.execute(worker);//calling execute method of ExecutorService  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  