import java.util.Arrays;
public class ArrayCheck{

	public static <T> Boolean compareArrays( T[] arrays1, T[] arrays2)
	{

		if(arrays1.length != arrays2.length )
			return false;

		for(int i=0; i<arrays2.length; i++)		
		{
			if( !arrays1[i].equals(arrays2[i]) )
			{
				return false;
			}
		}

		return true;
	}


	public static void main(String[] args)
	{

		Integer[] arr1 = {1,2,3,4,5};
		Integer[] arr2 = {1,2,3,4,5};

		String[] arr3 = {"JAVA","WORLD"};
		String[] arr4 = {"JAVA", "SCRIPT"};

		System.out.println("Original Arrays");
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println("arr2: "+Arrays.toString(arr2));
		System.out.println("arr3: "+Arrays.toString(arr3));
		System.out.println("arr4: "+Arrays.toString(arr4));

		System.out.println("\nCompare arr1 and arr2: " + compareArrays(arr1,arr2));
		System.out.println("\nCompare arr2 and arr3: " + compareArrays(arr2,arr3));
		System.out.println("\nCompare arr3 and arr4: " + compareArrays(arr3,arr4));
		System.out.println("\nCompare arr1 and arr4: " + compareArrays(arr1,arr4));

	}

}

		