package a4_2;

public class Dog extends Mammal {

	private boolean stupid;
	private String latinName;
	private String friendlyName;
	
	public Dog(String latinName, boolean stupid){
		super(latinName);
		this.stupid = stupid;
		this.latinName = latinName;
		
	}
	public Dog(String friendlyName, String latinName, boolean stupid, int getgestationTime){
		super(latinName, getgestationTime);
		this.friendlyName = friendlyName;
		this.stupid = stupid;
		this.latinName = latinName;
	}
	
	
	public String getFriendlyName() {
		return friendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	public String getLatinName() {
		return latinName;
	}
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	public boolean isStupid(){
		return stupid;
		
	}
	@Override
	public String getInfo() {
		return "The dogs latin name is " + getLatinName() + " and the dogs friendly name is " + getFriendlyName() + ", it nurses for " + getGestationTime() + " months and it is " + isStupid() + " that it is stupid. \n";
	}	
}