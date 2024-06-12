public class Person{

	private String name;
	private int age;
	
	Person(String name, int age){
	
		this.name = name;
		this.age = age;

	}

	void display(){

		System.out.println("The name of the Person is :"+name);
		System.out.println("The age of the person is :"+age);

	}

	public static void main(String[] args){


		Person p1 = new Person("Pradeep",24);
		Person p2 = new Person("Naresh", 25);

		p1.display();
		p2.display();


	}
}