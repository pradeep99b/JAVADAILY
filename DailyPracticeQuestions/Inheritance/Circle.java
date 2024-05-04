class Shape{

	float getArea(){


		return 0.0f;
	}


	float getPerimeter(){

		return 0.0f;
	}

}

public class Circle extends Shape{


	private float radius;

	Circle(float r){

		radius = r;
	}
	
	float getArea(){

		return (float)(22*radius*radius)/7;
	}

	float getPerimeter(){
		
		return (float)(44*radius)/7;
	}

	public static void main(String[] args){

	
		Circle c = new Circle(5.5f);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
	}

}