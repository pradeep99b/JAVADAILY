import java.util.*;
public class Backward{


	public static void main(String[] args){

		List<Integer> ll = new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		
		ListIterator it = ll.listIterator();

		while(it.hasNext()){
			it.next();
		}


		while(it.hasPrevious()){
			
			System.out.print(it.previous());
		}	
		



	}
}