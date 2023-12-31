package com.Kamesh.projects.PractisingJavaPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingCoVariantReturnTypes
{
	public static void main(String[] args) throws IOException 
	{
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	      String s = reader.readLine().trim();
	      Region region = null;
	      switch (s) {
	        case  "WestBengal":
	          region = new WestBengal();
	          break;
	        case "AndhraPradesh":
	          region = new AndhraPradesh();
	          break;
	      }
	      Flower flower = region.yourNationalFlower();
	      System.out.println(flower.whatsYourName());
	}
}
