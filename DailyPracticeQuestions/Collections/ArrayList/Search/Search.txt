import java.util.ArrayList;

public class Search{


	public static void main(String[] args){

		ArrayList al = new ArrayList();

		for(int i=0;i<10;i++)
			al.add(i);

		al.add("HelloWorld");


		System.out.println(al.contains("HelloWorld"));

		



	}
}