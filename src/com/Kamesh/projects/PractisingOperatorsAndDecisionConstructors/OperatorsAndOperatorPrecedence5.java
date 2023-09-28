package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class OperatorsAndOperatorPrecedence5 
{
	public static void main(String[] args) 
	{
		int a=200;
		int b=150;
		int c=120;
		
		int add=a+b+c;
		int sub=b-c-a;
		int mul=b*a*c;
		int div=b/c;
		int mod=b%a;
	    boolean res1=a>b;
	    boolean res2=b<c;
	    boolean res3=a>=c;
	    boolean res4=c<=a;
	    boolean res5=a!=b;
	    boolean res6=a==c;
	    boolean ope1=((a>b)&&(b>c));
	    boolean ope2=((c<a)||(a>c));
	    boolean ope3=!(a>c);
	    int inc=a++;
	    int inc2=++b;
	    int dec=--b;
	    int dec2=c--;
	    int pre1=a+b*c;
	    int pre2=(a+b)*c;
	    int pre3=a/b*c;
	    System.out.println("Addition:"+add);
	    System.out.println("Subtraction:"+sub);
	    System.out.println("Multiplication:"+mul);
	    System.out.println("Division:"+div);
	    System.out.println("Modulus:"+mod);
	    System.out.println("Greater than:"+res1);
	    System.out.println("Lesser than:"+res2);
	    System.out.println("Greater than equal:"+res3);
	    System.out.println("Lesser than equal:"+res4);
	    System.out.println("Not equals:"+res5);
	    System.out.println("Equals:"+res6 );
	    System.out.println("And operator:"+ope1);
	    System.out.println("Or operator:"+ope2);
	    System.out.println("Not Operator:"+ope3);
	    System.out.println("Increment:"+inc);
	    System.out.println("Another Increment:"+inc2);
	    System.out.println("Decrement:"+dec);
	    System.out.println("Another Decrement:"+dec2);
	    System.out.println("Operator Precedence:"+pre1);
	    System.out.println("Over ridden Operator Precedence:"+pre2);
	    System.out.println("Operator precedence:"+pre3);
	}
}
