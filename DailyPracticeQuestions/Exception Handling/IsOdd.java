public class IsOdd{


	static void goodeven(int n){

			

		if(n%2==1){

			throw new IllegalArgumentException(n+" is odd");
		}
		System.out.print("Number is even");
	}


	public static void main(String[] args){


		int n = 81;
		try{
		goodeven(81);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		finally{
		System.out.println("Program Exceuted Successfully");
		}
		
	}

}
			
// System.out.print(e) is not printing anything
	