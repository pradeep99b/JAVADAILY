abstract class Animal{



	public abstract void sound();

}
class Lion extends Animal{

	@Override
	public void sound(){
		
		System.out.println("Lion Roars!");
	}
}

class Tiger extends Animal{


	@Override
	public void sound() {

		System.out.println("Tiger growls!");
	}

}

public class One{

	public static void main(String[] args){
	
		Animal Lion = new Lion();
		Lion.sound();
		
		Animal Tiger = new Tiger();
		Tiger.sound();

	

	}

}
	