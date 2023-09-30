package com.Kamesh.projects.PractisingInheritance;

 interface ExtendableInterface2 
{
    void big();
}
interface Father extends ExtendableInterface2
{
	void big();
}
class Family implements Father
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
