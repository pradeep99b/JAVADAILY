import java.util.*;

public class Compare{


	public static void main(String[] args){


		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();

		for(int i=0;i<10;i++){

			al1.add(i);
			al2.add(i+1);

		}


		System.out.println(al1);
		System.out.println(al2);

		Iterator i = al1.iterator();

		while(i.hasNext()){

			Integer in = (Integer)i.next();

			System.out.println(al2.contains(in));
				
		
		}

		




	}

}