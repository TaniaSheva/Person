package Portfolio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.*;

public class Person {
	private String name;
	private String surname;
	private String email;
	private int age;
	private String hobby;
	private static Logger LOGGER = Logger.getLogger(PeoplePortfolio.class.getName());
	
	Person (){

	}
	
	Person (String n, String s, String e, String h, int a){
		name = n;
		surname = s;
		email = e;
		hobby = h;
		age = a;
		
		
	}

	public void setName(String inputName){
		
		this.name = inputName;
		
	}
	public void setSurname(String inputSurname){
		
		this.surname = inputSurname;
		
	}
	public void setEmail(String inputEmail){
		
		this.email = inputEmail;
		
	}
	
	public void setAge(int inputAge){
		
		this.age = inputAge;
		
	}

	public void setHobby(String inputHobby){
	
	this.hobby = inputHobby;
	
}
	public String getName(){
		
		return this.name;
		
	}
	public String getSurname(){
		
		return this.surname;
		
	}
	public String getEmail(){
		
		return this.email;
		
	}
	
	public int getAge(){
		
		return this.age;
		
	}

	public String getHobby(){
	
	return this.hobby;
	
	}
	public void checkAge (int age) {
		
	if (age < 1){
		
		LOGGER.warning("User has entered incorrect age. Age cannot be less that 1");
		}
	}
	
	public void pritnData(){
		System.out.println("Name is: " + getName());
		System.out.println("Surname is: " + getSurname());
		System.out.println("Email is: " + getEmail());
		System.out.println("Age is: " + getAge());
		System.out.println("Hobby is: " + getHobby());
	}
	

}
