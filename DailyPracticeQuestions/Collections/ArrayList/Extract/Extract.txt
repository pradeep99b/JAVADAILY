import java.util.*;

public class Extract{


	public static void main(String[] args){


		ArrayList al = new ArrayList();
		
		for(int i=0;i<10;i++)
			al.add(i);

		System.out.println(al);


		List sl = al.subList(0,3);
		System.out.println(sl);

	



	}
}