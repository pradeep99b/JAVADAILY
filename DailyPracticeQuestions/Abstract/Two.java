abstract class Shape{

	 abstract void calculateArea();	
	 abstract void calculatePerimeter();
}


class Circle extends Shape{


	private float r;

	Circle(float radius){

		r = radius;
	}


	void calculateArea(){
		
		System.out.println("The area of circle is " +(Math.PI*r*r));
	}

	void calculatePerimeter(){

		System.out.println("The Circumference of the circle is " + (Math.PI *2*r));
	}

}

class Triangle extends Shape{


	private float a;	
	private float b;
	private float c;
	
		
	Triangle(float first, float second, float third){

		a = first;
		b = second;
		c = third;
	}

		
	void calculateArea(){

		float sum = (a + b + c)/2;
		float area = (float)Math.sqrt(sum*(sum-a)*(sum-b)*(sum-c));
		System.out.println("The area of triangle is "+area);
	
	}

	void calculatePerimeter(){

		System.out.println("Perimeter of Triangle is "+ (a+b+c));
	}

}

public class Two{


	public static void main(String[] args){

		Shape s1 = new Circle(3.5f);
		Shape s2 = new Triangle(5,5,5);

		s1.calculateArea();
		s1.calculatePerimeter();

		s2.calculateArea();
		s2.calculatePerimeter();

	}
}
		
		
	 
		
