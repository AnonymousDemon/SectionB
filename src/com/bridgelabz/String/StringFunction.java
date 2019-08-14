package com.bridgelabz.String;


import java.util.Scanner;

import com.bridglelabz.utilityStatic.utility;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1,str2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string");
		str1=scanner.nextLine();
		String str3 = str1;
		System.out.println("Enter second String");
		str2 = scanner.nextLine();
		char[] a= str1.toCharArray();
		char[] b= str2.toCharArray();
		
		 if (utility.areAnagram(a, b)) 
		 {
	            System.out.println("The two strings are"
	                               + " anagram of each other"); 
		 }
	        else
	        {
	            System.out.println("The two strings are not"
	                               + " anagram of each other");
	        }
		if(utility.Palindrome(str3))
		{
			
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	
		 scanner.close();

	}

}
