package com.Kamesh.projects.PractisingInheritance;

interface ExtendableInterface5 
{
	 void big();
	}
	interface Father1 extends ExtendableInterface5
	{
		void big();
	}
	class Family1 implements Father
	{
		public void big()
		{
			System.out.println("Father is big in the family");
		}
		public void big2()
		{
			System.out.println("Father is big inthe home.");
		}
}
