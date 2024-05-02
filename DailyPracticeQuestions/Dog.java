public class Dog{


	private String name;
	private String breed;

	public Dog(String name, String breed){


		this.name = name;
		this.breed = breed;
	}

	public void setBreed(String breed){

		this.breed = breed;

	}

	public void setName(String name){

		this.name = name;

	}

	public void getBreed(){

		System.out.println("Breed of the Dog is :"+breed);

	}

	public void getName(){

		System.out.println("Name of the Dog is :"+name);

	}

	public static void main(String[] args){

		Dog d1 = new Dog("Tommy","KOIbhi");
		Dog d2 = new Dog("Tommy","KOIbhi");
		
		d1.setBreed("Bulldog");
		d1.setName("Charlie");
		d1.getBreed();
		d1.getName();


		System.out.println();
	
		d2.setBreed("Labrador");
		d2.setName("Puth");
		d2.getName();
		d2.getBreed();
		

	}

}


		