package a4_2;

public class Snake extends Animal {
	
	private boolean poisonous;



	public Snake(String latinName, boolean poisonous){
		super(latinName);
		this.poisonous = poisonous;
		this.latinName = latinName;
		
	}
	
	
	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}


	public boolean isPoisonous() {
		return poisonous;
	}
	@Override
	public String getInfo() {
		return "The snake latin name is " + getLatinName() + " and it is " + isPoisonous() +" that it is poisonous. \n";
	}
}
