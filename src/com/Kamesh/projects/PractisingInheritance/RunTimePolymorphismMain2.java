package com.Kamesh.projects.PractisingInheritance;

public class RunTimePolymorphismMain2 
{
    public static void Animals(RunTimePolymorphism2 r2)
    {
    	r2.noise();
    }
    public static void main(String[] args) 
    {
		Animals((RunTimePolymorphism2) new Tiger());
		Animals ((RunTimePolymorphism2) new Dog());
	}
}
