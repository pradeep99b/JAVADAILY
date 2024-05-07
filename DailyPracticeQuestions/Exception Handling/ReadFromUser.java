import java.util.Scanner;
import java.util.ArrayList;

public class ReadFromUser{
	
	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		int a ;
		System.out.println("Enter a number");
		a = sc.nextInt();

		al.add(1);
		al.add(2);
		al.add(3);

		try{

			if(al.contains(a)){
			
				throw new IllegalArgumentException(a+" already exists");
			}

			al.add(a);
		}

		catch(IllegalArgumentException e){
			System.out.println(e);
		}

		finally{

			System.out.print("Program Executed Successfully");
		}
	}
}
		
		
		
	
		
		

	 