import java.util.*;

public class Reverse{


	public static void main(String[] args){

		
		ArrayList al = new ArrayList();

		for(int i=0;i<10;i++)
			al.add(i);


		System.out.println(al);


		Collections.reverse(al);
	
		System.out.println(al);



	}
}