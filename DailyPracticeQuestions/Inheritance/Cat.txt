class Animal{


	void makeSound(){
		System.out.println(" The animal makes a sound ");
	}


}

public class Cat extends Animal{

	@Override
	void makeSound(){
		System.out.println("Meow");
	}

	public static void main(String[] args){

		Animal animal = new Animal();
		Cat c1 = new Cat();
		
		animal.makeSound();
		c1.makeSound();
	}
}