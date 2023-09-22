//Below We can see the Creation and use of For Loop.
//Write a program to find the Even Numbers and summation of the Even numbers Between M and N By using For Loop.
package Using_LoopingConstructors;

public class Create_and_Use_For_Loop
{
 public static void main(String[] args) 
 {
	 int m=10;
	 int n=20;
	 int sum=0;
	 for (int i = m; i < n; i++)
	 {
		if (i%2==0)
		{
			System.out.println("The Even numbers between  m and n :"+i);
			sum =sum+i;
			System.out.println("The Summation of the Even Numbers Between m and n :"+sum);
		}
	}
	
}
}
