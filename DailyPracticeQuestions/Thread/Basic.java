public class Basic extends Thread{


	public void run(){

		System.out.print("Hello World");
	}

	
	public static void main(String[] args){


		Basic thread = new Basic();
		thread.start();
	}
}


		


	


	