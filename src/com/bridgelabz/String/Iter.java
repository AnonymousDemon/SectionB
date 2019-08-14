package com.bridgelabz.String;

import java.util.Scanner;

public class Iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		str = scanner.nextLine();
		char[] strArr= str.toCharArray();
		int x = strArr.length-1;
		System.out.println(x);
		for(int i=0;i<x;i++)
		{
			
			char temp = strArr[i];
			System.out.println(temp);
			strArr[i]=strArr[i+1];
			System.out.println(strArr[i]);
			strArr[i+1]=temp;
			System.out.println(strArr[i+1]);
		}
		
		
	}

}
