public class Week{

	public enum days_of_week{

		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}
	public static void main(String args[]){

		days_of_week today = days_of_week.MONDAY;
		System.out.print(today);
	}
}