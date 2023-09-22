//Below we written code for Applying the static Keyword to methods And Fields.
package Encapsulation;

public class Person
{
		private String Name;
		private  int count;
		
	     Person(String name) 
		{
			Name = name;
			count++;
		}
		public String getName()
		{
			return Name;
		}
		public void setName(String name)
		{
			this.Name = name;
		}
		public int getCount()
		{
			return count;
		}
}
	


