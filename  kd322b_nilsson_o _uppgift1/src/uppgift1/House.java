package uppgift1;

public class House {

	 private int yearBuilt;
	 private int size;
	 private final int minSize = 10;
	 private final int maxSize = 1000;
	 public House(int yearBuilt,int size){
	 
		 this.yearBuilt = yearBuilt;
		 this.size = size;
	 }
	 public int getYearBuilt(){
		 
		 if(yearBuilt > 1800 && yearBuilt < 2016){
		 return this.yearBuilt;
		 }
		 else{
			 
			 return 1800;
		 }
	 }
	 public int getSize(){
		 
		 if(size > minSize && size < maxSize){
			 
			 return this.size;	 
		 }
		 
		 else{
			 
			 return 100;
		 }
		 
	 }

	
}


