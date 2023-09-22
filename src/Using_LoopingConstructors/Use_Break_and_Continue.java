//Below we can see te code for Use of Break and Continue.
//so as we know that break is used to terminate the loop.
//And the continue is used to skip the iteration of the loop.
package Using_LoopingConstructors;

public class Use_Break_and_Continue
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 0; j <=5; j++) 
			{
				if (i==3 && j==3)
				{
						break;                           //Break Statement.
				}
				System.out.println("The Break values of i :"+i);
				System.out.println("The Break value of j :"+j);
			}
		}
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 0; j <=5; j++) 
			{
				if (i==3 && j==3)
				{
						continue;                         //Continue Statement.
				}
				System.out.println("The Continue values of i :"+i);
				System.out.println("The Continue value of j :"+j);
			}
		}
	}
}
