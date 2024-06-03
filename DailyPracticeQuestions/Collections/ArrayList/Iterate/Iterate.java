import java.util.*;

public class Iterate{


	public static void main(String[] args){


	ArrayList al = new ArrayList();
	

	for(int i=0;i<10;i++)
		al.add(i);

	Iterator itr = al.iterator();

	while(itr.hasNext()){
		
		Integer i = (Integer)itr.next();
		System.out.println(i);
	


	}


	}
}