import java.util.List;
public class Sum{


	public static <T extends Number> void calculateNumberSum(List <T> numbers)
	{
		double evenSum = 0;
		double oddSum = 0;

		for(T number: numbers)
		{
			double n = number.doubleValue();
			if(n % 2== 0)
				evenSum += n;
			else
				oddSum += n;
		}


		System.out.println("Original List of Numbers: " + numbers);
		System.out.println("Sum of even numbers "+ evenSum);
		System.out.println("Sum of odd numbers " + oddSum);

	}
	


	public static void main(String[] args){


		List<Integer> integers = List.of(1,2,3,4,5,6,7);	
		List<Double> doubles = List.of(2.0,1.5,4.5,2.5,1.5);

		calculateNumberSum(integers);	
		calculateNumberSum(integers);

	}

}