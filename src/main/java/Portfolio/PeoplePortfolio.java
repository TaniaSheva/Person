package Portfolio;
import java.util.Scanner;

public class PeoplePortfolio {
	private static Scanner in;

	public static void main(String[] args) {
		
		System.out.print("Please type 1-st person name");
		System.out.println();
		in = new Scanner(System.in);
		String name1 = in.next();
		
		System.out.print("Please type 1-st person surname");
		System.out.println();
		in = new Scanner(System.in);
		String surname1 = in.next();
		
		System.out.print("Please type 1-st person email");
		System.out.println();
		in = new Scanner(System.in);
		String email1 = in.next();
		
		Person person1 = new Person(name1, surname1, email1); 
		//we don't need setters here as we used a constructor with parameters
		
		System.out.println("First person:");
		//used printData method as per description
		person1.pritnData();

		System.out.print("Please type 2-nd person name");
		System.out.println();
		in = new Scanner(System.in);
		String name2 = in.next();
		
		System.out.print("Please type 2-nd person surname");
		System.out.println();
		in = new Scanner(System.in);
		String surname2 = in.next();
		
		System.out.print("Please type 2-nd person email");
		System.out.println();
		in = new Scanner(System.in);
		String email2 = in.next();
		
		Person person2 = new Person(); 
		//I used a default constructor in this case so I need setters
		
		person2.setName(name2);
		person2.setSurname(surname2);
		person2.setEmail(email2);
		
		System.out.println("Second person:");
		person2.pritnData();
		
		
	}

}
