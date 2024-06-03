import java.util.ArrayList;

public class Update{


	public static void main(String args[]){


		ArrayList al = new ArrayList();


		for(int i =0; i<10; i++)
			al.add(i);

		System.out.println(al);


		al.set(3,4);

		System.out.println(al);
	

	}

}