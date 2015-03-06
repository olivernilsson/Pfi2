package se.mah.k3lara.skaneAPI.model;

import java.util.Calendar;

public class Line {
	private String line;
	private Calendar depTime;
	private boolean isTimingPoint;
	private String depTimeDeviation;
	private String lineName;
	private String stopPoint;
	private int lineTypeId;
	private String lineTypeName;
	private String towards;
	public Line() {
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public void setLineName(String name){
		this.lineName = name;
	}
	public String getLineName() {
		return this.lineName;	
	}
	public boolean getIsTimingPoint() {
		return isTimingPoint;
	}
	public void setIsTimingPoint(boolean isTimingPoint) {
		this.isTimingPoint = isTimingPoint;
	}
	
	public String getTowards() {
		return towards;
	}
	public void setTowards(String towards) {
		this.towards = towards;
	}
	public String getLineTypeName() {
		return lineTypeName;
	}
	public void setLineTypeName(String lineTypeName) {
		this.lineTypeName = lineTypeName;
	}
	public int getLineTypeId() {
		return lineTypeId;
	}
	public void setLineTypeId(int lineTypeId) {
		this.lineTypeId = lineTypeId;
	}
	public String getStopPoint() {
		return stopPoint;
	}
	public void setStopPoint(String stopPoint) {
		this.stopPoint = stopPoint;
	}
	public Calendar getDepTime() {
		return depTime;
	}
	public void setDepTime(Calendar depTime) {
		this.depTime = depTime;
	}
	public String getDepTimeDeviation() {
		return depTimeDeviation;
	}
	public void setDepTimeDeviation(String depTimeDeviation) {
		this.depTimeDeviation = depTimeDeviation;
	}
	
	

	//More methods here for the rest of the tags
	//And perhaps some special methods ????

}