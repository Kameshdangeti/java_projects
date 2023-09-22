//Below we can see the code for main method of Exercise.java.
//it is for Method overriding.
package Method_OverRiding;

public class Exer_main
{
	public static void main(String[] args)
	{
		Diet d=new Diet();
		d.run();
		d.gym();
		d.yoga();
	}
}
//And there is very small difference between the type of reference and type of an object.
//i.e.,above we can see the calling of nonstatic method in that "Diet" is type of reference.
//and "d" is type of an object.