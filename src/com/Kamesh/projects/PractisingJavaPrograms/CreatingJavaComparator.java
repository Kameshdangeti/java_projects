package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingJavaComparator 
{
	public static void main(String[] args) 
    {
   	  Scanner scan = new Scanner(System.in);
   	  System.out.println("Enter the N value :");
         int n = scan.nextInt();
       System.out.println("Enter the palyer names with scores:");
         Player[] player = new Player[n];
         Checker checker = new Checker();
         
         for(int i = 0; i < n; i++)
         {
             player[i] = new Player(scan.next(), scan.nextInt());
         }
         scan.close();
         Arrays.sort(player, checker);
    	 System.out.println("List of players with their scores from highest to lowest :");
         for(int i = 0; i < player.length; i++)
         {
             System.out.printf("%s %s\n", player[i].name, player[i].score);
         }
    }
}
