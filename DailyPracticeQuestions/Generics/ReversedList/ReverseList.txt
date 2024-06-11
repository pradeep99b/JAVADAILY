import java.util.*;
public class ReverseList{

	public static <T> List<T> reverse(List<T> al){

		
		Collections.reverse(al);
		return al;


	}


	public static void main(String[] args){

		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		System.out.println(reverse(al));

	}
}