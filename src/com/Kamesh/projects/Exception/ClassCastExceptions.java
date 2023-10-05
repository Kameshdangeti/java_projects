//Below code is main method of all the Father.java,Daughter.java and Son.java classes.

/*package Exceptions;


public class Class_Cast_Exceptions               //It is written in seperate class.
{
	public static void main(String[] args) 
	{
		Father f=(Father) new Daughter();       //Up casting
		f.kids();            
		Daughter d=(Daughter)f;                 //Down casting
		d.kids(); 
		Son s=(Son) f;                          //Down casting      //This statement of is not possible
		s.kids();                                                   //it creates Exception.Because,there is no upcasting.
	}
}*/


//And the exception can be handled by using try/catch block as we can see in below code.

package com.Kamesh.projects.Exception;

public class ClassCastExceptions
{
	public static void main(String[] args) 
	{
		try
		{
		Father f=(Father) new Daughter();       //Up casting
		Father.kids();     
		Daughter d=(Daughter)f;                 //Down casting
		Daughter.kids();
		Son s=(Son) f;                          //Down casting
		Son.kids();
		f=d;    //It is written
		f=s;    //to fix the warning that is variable is not declared.
		}
		catch (ClassCastException e)
		{
			System.out.println("Down casting is not possible without upcasting");
		}
	}
}
