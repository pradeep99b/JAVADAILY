class Shape{

	 protected void getArea(){

		System.out.print("The area is ");
	}

}

public class Rectangle extends Shape{


	protected void getArea(){

		System.out.print("The area is ");

	}
	
	

	public static void main(String[] args){

		Rectangle r = new Rectangle();
	

		r.getArea();
	}
}