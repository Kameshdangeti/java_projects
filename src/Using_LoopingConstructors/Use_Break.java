//Below we can see te code for Use of Break.
//so as we know that break is used to terminate the loop.
package Using_LoopingConstructors;

public class Use_Break
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 3; i++) 
		{
			for (int j = 0; j <=3; j++) 
			{
				if (i==3 && j==3)
				{
						break;                           //Break Statement.
				}
				System.out.println("The Break values of i :"+i);
				System.out.println("The Break value of j :"+j);
			}
		}
	
	}
}
