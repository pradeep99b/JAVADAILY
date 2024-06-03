import java.util.*;

class MyComparator implements Comparator{

	
	public int compare(Object obj1 , Object obj2){

		String s1 = (String)obj1;
		String s2 = (String)obj2;
		
		/*if(s1 > s2)
			return +1;
		else if(s1 < s2)
			return -1;
		else
			return 0;
		*/

		return s2.compareTo(s1);
		
	}
}

public class Demo{


	public static void main(String[] args){

		TreeSet ts = new TreeSet(new MyComparator());
	
		ts.add("Apple");
		ts.add("Mango");
		ts.add("Guvava");
		ts.add("Lichi");


		System.out.println(ts);
	

	}
}