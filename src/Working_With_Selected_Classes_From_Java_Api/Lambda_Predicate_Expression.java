   //Below code is for he predicate of Lambda Expression.

package Working_With_Selected_Classes_From_Java_Api;

import java.util.function.Predicate;

public class Lambda_Predicate_Expression 
{
	public static void main(String[] args)
	{
		Predicate<Integer> pde =i  -> i>=10;                      //Lambda Expression
		System.out.println("Predicate value-1 :"+pde.test(10));
		System.out.println("Predicate value-2 :"+pde.test(0));
		System.out.println("Predicate value-3 :"+pde.test(5));
		System.out.println("Predicate value-4 :"+pde.test(20));
	}
}
