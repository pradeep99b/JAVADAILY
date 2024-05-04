public class Weekend{

	public enum week_end{

		SATURDAY,
		SUNDAY
	}

	public static void main(String[] args){

		week_end first = week_end.SATURDAY;
		week_end second = week_end.SATURDAY;
		 

		System.out.print("First day of the weekend is "+ first);
		System.out.print("Second day of the weekend is "+ second);
	}

}