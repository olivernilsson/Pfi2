package a5;

public class ClockLogic implements ClockInterface {

	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
	
	private int hours;
	private int minutes;
	
	
	public ClockLogic (DigitalClockGUI clockIn){
		this.clockGUI = clockIn;
		
		Thread t = new ClockThread(this);
		t.start();
		
	}
	
	public void setAlarm (int hours, int minutes){
		this.alarmHour = hours;
		this.alarmMinute = minutes;
		
	}
	
	public void clearAlarm(){
		  clockGUI.lblAlarmSet.setText("Alarm off");
		  clockGUI.lblAlarmMessage.setText("");
		  clockGUI.lblErrorMessage.setText("");
		  this.alarmHour = 100;
		  this.alarmMinute = 100;
		
	}

	@Override
	public void update(int hours, int minutes, int seconds) {
		  String hourZero = "";
		  String minuteZero = "";
		  String secondZero = "";
		  
		  if (hours < 10){
		   hourZero = "0";
		  }
		  if (minutes < 10){
		   minuteZero = "0";
		  }
		  if (seconds < 10){
		   secondZero = "0";
		  }
		  

		  String hourString = hourZero + Integer.toString(hours);
		  String minuteString = minuteZero + Integer.toString(minutes);
		  String secondString = secondZero + Integer.toString(seconds);
		  String finalTimeString = hourString + ":" + minuteString + ":" + secondString;

		  clockGUI.setTimeOnLabel(finalTimeString);

		  hourZero = "";
		  minuteZero = "";
		  secondZero = "";

		  this.hours = hours;
		  this.minutes = minutes;

		  if (this.alarmHour == this.hours && this.alarmMinute == this.minutes) {
			  clockGUI.alarm(true);
		  }

	}
}