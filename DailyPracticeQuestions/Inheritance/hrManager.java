class Employee{


	 String name;
	 int id;
	 int salary;
	 int dept;


	Employee(String name, int id, int salary, int dept){

		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
	}


	public void work(){

		System.out.print("The work is ");

	}

	public void getSalary(){

		System.out.print("The Salary is ");


	}

	public void display(){
		
		System.out.print(name+" "+id+" "+salary+" "+dept);
	}

}

public class hrManager extends Employee{
	
	public void work(){

	
		System.out.print(" HR Manager ");
	}

	public void addEmployee(){
		
		super("Pradeep", 70, 50000, 3);
	}

	public static void main(String args[]){

		hrManager hr = new hrManager();
		hr.work();
		hr.addEmployee();
		hr.display();
	}
}

		