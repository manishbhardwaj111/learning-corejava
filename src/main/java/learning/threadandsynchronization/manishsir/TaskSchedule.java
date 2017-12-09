package learning.threadandsynchronization.manishsir;

import java.awt.Frame;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
	int count;
	
	public Task(int count){
		this.count=count;
	}
	// run is a abstract method that define task perform at scheduled time
	public void run() {
		count++;
		count=count%400;
		System.out.println("counrt=="+count);
		Frame f = new Frame();
		f.setSize(250, 150);
		f.setVisible(true);
		f.setLocation(count, 2*count);
		Label label=new Label();
		label.setText("I love u bharti");
		label.setAlignment(Label.CENTER);
		f.add(label);
		
	}
}

public class TaskSchedule {
	public static void main(String[] s) {
		Timer timer = new Timer();
		int delay = 2000;
		int period = 100;
		timer.scheduleAtFixedRate(new Task(0), delay, period);
	}
}