package com.bridgelabz.String;


import java.util.ArrayList;
import java.util.Scanner;

import com.bridglelabz.utilityStatic.utility;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1,str2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string");
		str1=scanner.nextLine();
		int max = str1.length()-1;
		String str3 = str1;
		System.out.println("Enter second String");
		str2 = scanner.nextLine();
		char[] a= str1.toCharArray();
		char[] b= str2.toCharArray();
		//outputs anagram
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
		 
		 //outpits palindrome
		if(utility.Palindrome(str3))
		{
			
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		//outputs permutation using recursion
		
		System.out.println("Permutations using recursive  are");
		utility.permute(str1, 0, max);
		
		
		//outputs permutation using iterative
		
		System.out.println("Permutations using iterative is");
		utility.permutations(str1);
		
		utility.compareList();
	
		 scanner.close();

	}

}
