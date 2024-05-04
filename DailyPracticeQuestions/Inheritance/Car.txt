class Vehicle{

	void drive(){

	System.out.println("I am ");
	
	}

}

public class Car extends Vehicle{


	void drive(){

		System.out.print("repairing a car");
	}


	public static void main(String args[]){

		Vehicle v = new Vehicle();
		Car c = new Car();
		
		v.drive();
		c.drive();
	}
}