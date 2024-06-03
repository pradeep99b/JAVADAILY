import java.util.ArrayList;

public class AddFirst{


	public static void main(String[] args){


		ArrayList al = new ArrayList();

		
		for(int i =0; i<10; i++)
			al.add(i);

		System.out.println(al);
		al.add(0,10);
		System.out.print(al);


	}
}