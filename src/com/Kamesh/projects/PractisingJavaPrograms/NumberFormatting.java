package com.Kamesh.projects.PractisingJavaPrograms;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount :");
		double currency = sc.nextDouble();
		sc.close();
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = new DecimalFormat("###,###.00");
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINESE);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("US: " + us.format(currency));
		System.out.println("India: Rs." + india.format(currency));
		System.out.println("China: " + china.format(currency));
		System.out.println("France: " + france.format(currency));
	}
}
