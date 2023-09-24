//The below code is the main method for the "person.java".
//And it should be written in another class
package Encapsulation;

public class Person_main
{

	public static void main(String[] args)
	{
		Person p1=new Person("Lucky");
		Person p2=new Person("Kamesh");
		Person.setclg("SPCE");
		p1.getPersoninfo();
		p2.getPersoninfo();	
	}
}
