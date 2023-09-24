
                  //Below code is the extension "Sample.java".
                  //But because of main method it is written in another class.
                  //code for the Using Of lambda_Expression.

package Working_With_Selected_Classes_From_Java_Api;

public class Lambda_Expression
{
	public static void main(String[] args)
	{
		Sample s=()-> {
			             System.out.println("Implementng the Task1 method by using the Lambda Expression.");
		               };
		               s.Task1();
	}

}
