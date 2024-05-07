public class Demo{


	public static void main(String[] args){

		try{
		
			int a = 9;
			int b =0 ;
			
			System.out.println(a/b);
		}

		catch(ArithmeticException e){

			e.printStackTrace();
		}

		finally{

			System.out.print("Program Executed Successfully");

		}

	}

}
			

			
		