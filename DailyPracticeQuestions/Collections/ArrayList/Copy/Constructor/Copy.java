import java.util.ArrayList;

public class Copy{


	public static void main(String[] args){

		ArrayList al = new ArrayList();

		for(int i=0;i<10;i++)
			al.add(i);
		
		System.out.println(al);
		ArrayList al2 = new ArrayList(al);

		System.out.println(al2);
		




	}
}