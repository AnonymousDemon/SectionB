package com.bridgelabz.String;

import java.util.Scanner;

import com.bridglelabz.utilityStatic.utility;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month ,year,x;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");
		year = scanner.nextInt();
		System.out.println("Enter month");
		month = scanner.nextInt();
//		System.out.println("Enter day");
//		x = scanner.nextInt();
//		System.out.println("Day of week = "+utility.DayOfWeek(x, month, year));
		 String[] months = {
		            "",                               // leave empty so that months[1] = "January"
		            "January", "February", "March",
		            "April", "May", "June",
		            "July", "August", "September",
		            "October", "November", "December"
		        };

		        // days[i] = number of days in month i
		        int[] days = {
		          0,  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		        };
		        
		        if (month == 2 && utility.isLeapYear(year)) 
		        	days[month] = 29;
		        
		     // print calendar header
		        System.out.println("   " + months[month] + " " + year);
		        System.out.println(" S  M Tu  W Th  F  S");

		        // starting day
		        int d = utility.DayOfWeek(month, 1, year);
		        for (int i = 0; i < d; i++)
		            System.out.print("   ");
		        for (int i = 1; i <= days[month]; i++) {
		            System.out.printf("%2d ", i);
		            if (((i + d) % 7 == 0) || (i == days[month])) 
		            	System.out.println();


		scanner.close();
	}
	}
	
}
