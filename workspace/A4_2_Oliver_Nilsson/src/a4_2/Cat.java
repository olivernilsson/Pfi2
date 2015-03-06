package a4_2;

public class Cat extends Mammal {

	private int numberOfLives;
	private int gestationTime;
	private String latinName;

 public Cat(String latinName,int numberOfLives, int gestationTime){
	 super(latinName);
	 this.numberOfLives = numberOfLives;
	 this.latinName = latinName;
	 this.gestationTime = gestationTime;
 }



public int getGestationTime() {
	return gestationTime;
}



public void setGestationTime(int gestationTime) {
	this.gestationTime = gestationTime;
}



public String getLatinName() {
	return latinName;
}



public void setLatinName(String latinName) {
	this.latinName = latinName;
}



public int getNumberOfLives() {
	return numberOfLives;
}


public void setNumberOfLives(int numberOfLives) {
	this.numberOfLives = numberOfLives;
}


@Override
public String getInfo() {
	
	return "The cat latin name is " + getLatinName() + " the cat has " + getNumberOfLives() + " lives and its gestationtime is " + getGestationTime() + ". \n";

}
 
}
