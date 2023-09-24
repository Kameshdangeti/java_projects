                       //Hierarchical Inheritance.
             //Here this is similar to multi-level.But slight difference is here subclasses will not one by one.
            //it will be side to side.so,in this inheritance also there are 2 subclasses and 1 superclass.
            //for below code main method is called in seperate class i.e., "F_main.java".
package Inheritances;

public class F 
{
	public void demo1()
	{
		System.out.println("Demo1");
	}
}
class G extends F
{
	public void demo2()
	{
		demo1();
		System.out.println("Demo2");
	}
}
class H extends F
{
	public void demo3()
	{
		demo1();
		System.out.println("Demo3");
	}
}
