import java.util.*;

public class Copy{


	public static void main(String[] args){


		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();


		for(int i=0;i<10;i++){
			al1.add(i);
			al2.add(100+i);
		}

		System.out.println(al1);
		System.out.println(al2);

		Collections.copy(al1,al2);
		
		System.out.println(al1);
		System.out.println(al2);

		
	

	}

}