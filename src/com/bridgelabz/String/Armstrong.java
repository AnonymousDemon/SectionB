package com.bridgelabz.String;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,b=0,a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		n=scanner.nextInt();
		int temp = n;
		while(n>0)
		{
			a = n%10;
			n=n/10;
			b= b + (a*a*a);
			
		}
		
//		
//		if(temp==b)
//		{
//			System.out.println("arms");
//		}
//		else
//		{
//			System.out.println("No arm");
//		}
		scanner.close();
	}

}
