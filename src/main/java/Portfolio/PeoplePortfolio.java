package Portfolio;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;


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
		
		System.out.print("Please type 1-st person hobby");
		System.out.println();
		in = new Scanner(System.in);
		String hobby1 = in.next();
		
		System.out.print("Please type 1-st person age");
		System.out.println();
		in = new Scanner(System.in);
		int age1 = in.nextInt();
				
		Person person1 = new Person(name1, surname1, email1, hobby1, age1); 
		
		person1.checkAge(age1);
		
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
		
		System.out.print("Please type 2-nd person hobby");
		System.out.println();
		in = new Scanner(System.in);
		String hobby2 = in.next();
		
		System.out.print("Please type 2-nd person age");
		System.out.println();
		in = new Scanner(System.in);
		int age2 = in.nextInt();
		
		
		
		Person person2 = new Person(); 
		//I used a default constructor in this case so I need setters
		
		person2.setName(name2);
		person2.setSurname(surname2);
		person2.setEmail(email2);
		person2.setAge(age2);
		person2.setHobby(hobby2);
		
		person1.checkAge(age2);
		
		System.out.println("Second person:");
		person2.pritnData();
		
		System.out.print("Please type 3-d person name");
		System.out.println();
		in = new Scanner(System.in);
		String name3 = in.next();
		
		System.out.print("Please type 3-d person surname");
		System.out.println();
		in = new Scanner(System.in);
		String surname3 = in.next();
		
		System.out.print("Please type 3-d person email");
		System.out.println();
		in = new Scanner(System.in);
		String email3 = in.next();
		
		System.out.print("Please type 3-d person hobby");
		System.out.println();
		in = new Scanner(System.in);
		String hobby3 = in.next();
		
		System.out.print("Please type 3-d person age");
		System.out.println();
		in = new Scanner(System.in);
		int age3 = in.nextInt();
		
		
		Person person3 = new Person(name3, surname3, email3, hobby3, age3); 
		//we don't need setters here as we used a constructor with parameters
		
		person1.checkAge(age3);
		
		System.out.println("Third person:");
		//used printData method as per description
		person3.pritnData();
		
		System.out.print("Please type 4-th person name");
		System.out.println();
		in = new Scanner(System.in);
		String name4 = in.next();
		
		System.out.print("Please type 4-th person surname");
		System.out.println();
		in = new Scanner(System.in);
		String surname4 = in.next();
		
		System.out.print("Please type 4-th person email");
		System.out.println();
		in = new Scanner(System.in);
		String email4 = in.next();
		
		System.out.print("Please type 4-th person hobby");
		System.out.println();
		in = new Scanner(System.in);
		String hobby4 = in.next();
		
		System.out.print("Please type 4-th person age");
		System.out.println();
		in = new Scanner(System.in);
		int age4 = in.nextInt();
		
		
		Person person4 = new Person(name4, surname4, email4, hobby4, age4); 
		//we don't need setters here as we used a constructor with parameters
		
		person1.checkAge(age4);
		
		System.out.println("First person:");
		//used printData method as per description
		person4.pritnData();
		
		ArrayList<Person> list = new ArrayList<Person>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        
        
        PeopleStat.ageStat (list);
	}

}
