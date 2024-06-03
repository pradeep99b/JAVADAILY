import java.util.*;

public class Sort{

	public static void main(String[] args){



		ArrayList al = new ArrayList();

		for(int i=9;i>0;i--)
			al.add(i);

		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);


	}

}