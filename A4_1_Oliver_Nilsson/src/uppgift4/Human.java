package uppgift4;

public class Human {

	private String name;

	private Dog dog;

	public Human(String name){

		this.name = name;
		
	}
	
	public String getName(){

		return this.name;
	}
	
	public void buyDog(Dog dog){
		
		this.dog = dog;
		
	}
	
	public String getInfo(){
		
		if (name != null && dog != null){
			return (name + " äger en hund som heter " + dog.getDog());
		}else if (name != null && dog == null){
			return (name + " äger inte en hund");
		}else {
			return null;
	}
	
		
	
	}
	
}
