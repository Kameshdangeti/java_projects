//Below we can see the  basic code for Do-While loop.
package Using_LoopingConstructors;

public class DoWhile_Loop 
{
 public static void main(String[] args) 
 {
	int i=1;
	do 
	{
		System.out.println(i);
		i++;
		if (i%2==0) 
		{
			System.out.println(i);
		}
	}
	while (i<=10);
 }
}
