//Below code is used to switch the statement like if-else-if-else statements.
//write a program using switch statement for finding the day in a week. 
package Using_Operators_And_Decision_Constructs_Operator_Precidence;

import java.util.Scanner;

public class Switch_Statement 
{
	public static void main(String[] args) 
	{
		int day;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number from 1-7 to know the day");
		day=sc.nextInt();
		
		switch (day) 
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sonday");
			break;
			

		default:
			System.out.println("Invalid number");
			break;
		}
	}

}
