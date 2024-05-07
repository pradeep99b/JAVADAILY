import java.util.Scanner;
class NoVowelsException extends Exception{


	public NoVowelsException(String message){

		super(message);
	}

}

public class NoVowels{


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		sc.close();
	
		int flag = 0;


		for(int i=0;i<s.length();i++){
		
		
			char ch = Character.toLowerCase(s.charAt(i));

			if(ch =='a' || ch =='e' ||  ch =='i' || ch =='o' || ch =='u'){


				flag = 1;				
				break;

			}
			
				
		}

		try{
			
		
			if(flag == 0)
				throw new NoVowelsException(s+" has no vowels");


		}
		catch(NoVowelsException e){

			e.printStackTrace();
		}

		finally{

			System.out.print("Program Executed Successfully");
		}


	}

}
	