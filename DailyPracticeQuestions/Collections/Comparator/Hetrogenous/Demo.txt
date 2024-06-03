import java.util.*;

class MyComparator implements Comparator{

	

	public int compare(Object obj1, Object obj2){


		String s1 = obj1.toString();
		String s2 = obj2.toString();

		int a = s1.length();
		int b = s2.length();

		if(a>b)
			return 1;
		else if(a<b)
			return -1;
		else
			return s1.compareTo(s2);


	}
	


}

public class Demo{


	public static void main(String[] args){

		TreeSet ts = new TreeSet(new MyComparator());
		
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("AA"));
		ts.add(new StringBuffer("XX"));
		ts.add(new StringBuffer("ABCD"));
		ts.add(new StringBuffer("A"));

		System.out.println(ts);


	}

}