public class Person{


	private String name;
	private int age;

	Person(int age, String name){
		
		this.age = age;
		this.name = name;
	} 

	public void display(){
	
		System.out.println("Details Of Person are");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);

	}

	public static void main(String[] args){

		Person p1 = new Person(23,"Pradeep");
		Person p2 = new Person(23,"Naresh");
		
		p1.display();
		p2.display();

	}
}
		
		
		