import java.util.ArrayList;

public class RemoveThird{


	public static void main(String[] args){



		ArrayList al = new ArrayList();

		for(int i=0;i<10; i++){

			al.add(i);

		}

		System.out.print(al);
		al.remove(3);
		System.out.print(al);


	}
}