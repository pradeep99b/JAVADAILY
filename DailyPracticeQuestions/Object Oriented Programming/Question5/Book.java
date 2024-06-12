import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class Book{

	private String title;
	private String author;
	private int ISBN;


	 
	Book(String title, String author, int ISBN){

		this.title = title;
		this.author = author;
		this.ISBN = ISBN;

	}
	

	String getTitle(){
		return title;
	}

	String getAuthor(){
		return author;
	}

	int getISBN(){
		return ISBN;
	}

	void setTitle(String title){
			
		this.title = title;
	}

	void setAuthor(String author){
		this.author = author;
	}

	void setISBN(int ISBN){
		this.ISBN = ISBN;
	}

	
	
	static void addBook(ArrayList<Book> al){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Book title");
		String title = sc.nextLine();
		
		System.out.println("Enter the author of the Book");
		String author = sc.nextLine();

		System.out.println("Enter the ISBN of the Book");
		int ISBN = Integer.parseInt(sc.nextLine());	


		Book b_new = new Book(title, author, ISBN);

		al.add(b_new);

		sc.close();

	}

	static void removeBook(ArrayList<Book> al, int ISBN){
	
		Iterator<Book> it = al.iterator();
		int flag= 0;

		while(it.hasNext()){

			Book book = it.next();
			if(book.getISBN() == ISBN){
				it.remove();
				flag =1;
				break;	
			}

			
		}

		if(flag==0)
			System.out.println("Book with ISBN no"+ ISBN +" is not present");

		else
			System.out.println("Book with ISBN no "+ ISBN +" successfully deleted");

	}

	public static void main(String[] args){

		ArrayList<Book> al = new ArrayList<Book>();
		
		addBook(al);
		addBook(al);

		System.out.println(al);
	
		removeBook(al,1234);
		
		System.out.println(al);

	}

}
		