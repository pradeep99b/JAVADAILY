
import java.util.*;

class MyComparator implements Comparator{

	public int compare(Object obj1 , Object obj2){


		Integer I1 =  (Integer)(obj1);
		Integer I2 = (Integer)(obj2);

		if(I1 > I2){
			return -1;

		}
		else if(I1 < I2){
			return 1;		
		}
		else
			return 0;

	}
}

public class Demo{


	public static void main(String[] args){


		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(0);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);

		System.out.println(ts);
	
	}
}