class bankAccount{


	protected String  depositor;
	protected int accNumber;
	protected int IFSC;
	protected float balance;

	public bankAccount(String name, int num, int code, float bal){
		
		depositor = name;
		accNumber = num;
		IFSC = code;
		balance = bal;

	}

	void deposit(float n){

		balance+=n;
	}

	void withdrawl(float n){
		balance-=n;
	
			
	}

	void display(){

		System.out.println(" Balance is :"+balance);
	}

}

public class SavingsAccount extends bankAccount{

	SavingsAccount(String name, int num, int code, float bal){
		super(name,num,code,bal);
	}
	
	
	void withdrawl(float n){

		if(n > balance){

			System.out.print("Insufficient Balance");
			
		}
		else
			super.withdrawl(n);	

	}	
	

	public static void main(String[] args){

		SavingsAccount sa = new SavingsAccount("Pradeep", 68990001,2424,8709.89f);
		
		sa.display();
		sa.withdrawl(400.8f);
		sa.display();
		sa.deposit(100);
		sa.display();
		

	}

}
		
		

		
		


		