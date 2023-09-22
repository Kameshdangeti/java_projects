//In the below code we can see the code for the structure of the java class
//Below we created classes of gender and name which is static and non-static respectively
//so to print the data saved in the classes,we created non-static method and after we called the class.
package java_Basics;

public class Structures_of_java
{
   public void Gender()  //non-static  
   {
	   System.out.println("male");
   }
   public static void name()  //static
   {
	   System.out.println("Kamesh");
   }
   public static void main(String[] args) 
   {
     Structures_of_java s= new Structures_of_java(); //non-static method is created to call the class and to print it.
     s.Gender();
     name();
}
} 
