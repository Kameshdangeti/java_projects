package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class PrintingJavaLambdaExpressions 
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++){
            int condition = sc.nextInt();
            int num = sc.nextInt();
            
            if (condition == 1){
                if (num % 2 == 0){
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }
            }
            else if (condition == 2) {
                if (isPrime(num)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }
            }
            else if (condition == 3) {
                if (isPalindrome(num)) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        } 
        sc.close();
    }
    
    static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        
        while(num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return original == reversed;
    }

}
