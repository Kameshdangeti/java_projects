//write a program to print number which are divisible by 4  between a and b using if and if-else
package Using_Operators_And_Decision_Constructs_Operator_Precidence;

public class if_ifelse_terenary_constructs
{
	public static void main(String[] args) 
	{
		
		//code for if,if-else 
		
		int a=10;
		int b=20;
		for (int i = a; i <=b; i++)
		{
			if (i%4==0) 
			{
				System.out.println("The numbers which are divisible by 4 and 6 :"+i);
			 }
			else 
			{
				System.out.println("There are no numbers which are divisible by 4 and 6 ");
			}
		}
		
		//code for terenary construct.
		//write a program for to print largest of 3 numbers.
		
		int x=50;
		int y=100;
		int z=150;
		String result=((x>y)&&(y>z))?x+ "is largest"
				      : (y>x)&&(y>z)?y+ "is largest"
				    	  : z+ "is largest";
		System.out.println(result);
	}
}
