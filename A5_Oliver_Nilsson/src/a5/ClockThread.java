package a5;

import java.util.Calendar;


public class ClockThread extends Thread{


	private ClockInterface clockInterface;

	
	public ClockThread (ClockInterface ci){
		this.clockInterface = ci;
	}
	
	
	public void run(){
			while (true) {
				
				Calendar time = Calendar.getInstance();
				clockInterface.update(time.get(Calendar.HOUR_OF_DAY), time.get(Calendar.MINUTE), time.get(Calendar.SECOND));

				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}
	}
	
}