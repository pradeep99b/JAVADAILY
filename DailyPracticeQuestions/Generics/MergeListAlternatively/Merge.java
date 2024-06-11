import java.util.*;
public class Merge{

	public static <T> List<T> merge(List<T> al1, List<T> al2){


		List<T> al = new ArrayList<T>(al1);
		for(int i=0; i<al2.size(); i++)
			al.add(2*i+1,al2.get(i));
		

		return al;

	}


	public static void main(String[] args){
		
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(3);
		al1.add(5);

		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(4);
		al2.add(6);

		
		System.out.println(merge(al1,al2));

	}
}