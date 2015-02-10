package a4_2;

public abstract class Animal {

	public String latinName;
	public String friendlyName;
	
	public Animal(String latinName){
		
		
	}
	
	public abstract String getInfo();

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
	
}