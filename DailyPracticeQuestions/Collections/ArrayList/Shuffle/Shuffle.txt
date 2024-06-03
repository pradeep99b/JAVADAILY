import java.util.*;

public class Shuffle{

	public static void main(String[] args){



		ArrayList al = new ArrayList();

		for(int i=0;i<10;i++)
			al.add(i);
		

		System.out.println(al);

		Collections.shuffle(al);
		System.out.println(al);
		


	}

}