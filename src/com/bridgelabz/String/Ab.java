package com.bridgelabz.String;

import java.util.Scanner;

public class Ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String str1,rev="";
		System.out.println("Enter a string");
		str1 = scanner.nextLine();
		for(int i = str1.length() - 1; i >= 0; i--)
        {
            rev = rev + str1.charAt(i);
        }
        System.out.println(rev);
	}

}
