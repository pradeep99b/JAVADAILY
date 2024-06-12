public class Dog{

	private String name;
	private String breed;
		
	public Dog(String name, String breed){

		this.name = name;
		this.breed = breed;

	}

	void setName(String name){
		this.name = name;
	}

	void setBreed(String breed){

		this.breed = breed;
	}

	String getName(){
		return name;
	}

	String getBreed(){
		return breed;
	}


	public static void main(String[] args){

		Dog d1 = new Dog("Rocky","Bhotia");
		Dog d2 = new Dog("Lola" , "Pug");

		System.out.println("The Dog named " +d1.getName() + " is of breed " + d1.getBreed());
		System.out.println("The Dog named " +d2.getName() + " is of breed " + d2.getBreed());

		d1.setName("Nelson");
		d2.setBreed("BULL DOG");

		System.out.println("The Dog named " +d1.getName() + " is of breed " + d1.getBreed());
System.out.println("The Dog named " +d2.getName() + " is of breed " + d2.getBreed());
	}

}