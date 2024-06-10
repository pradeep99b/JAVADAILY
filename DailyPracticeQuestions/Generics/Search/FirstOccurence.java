import java.util.List;
public class FirstOccurence{


	public static <T> int Search( List<T> l, T target){


		for(int i=0;i<l.size();i++)
			if(l.get(i).equals(target))
				return i;
		
	

		return -1;



	}

	public static void main(String[] args){


		List<Integer> l = List.of(1,2,3,4,5,6,7,8,9);
		int target =3;
		System.out.println(Search(l,target));

		


	}

}