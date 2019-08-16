package com.bridgelabz.String;

import java.util.Scanner;

import com.bridglelabz.utilityStatic.utility;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day,month ,year,d1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");
		year = scanner.nextInt();
		if(year>=1582) 
		{	
			
			
		System.out.println("Enter month");
		month = scanner.nextInt();
		if(month>=1&&month<=12) 
		    {
			
			
		System.out.println("Enter a day");
		day=scanner.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0)
		     {
			if(month==2&&day<=29)
			  {
				d1 = utility.DayOfWeek(day, month, year);		
				System.out.println("d1=" +d1);
			   }
		
			else
			{
				d1 = utility.DayOfWeek(day, month, year);		
			System.out.println("d1=" +d1);
			}
			
		}
		
	
			else
			{
				if(month==2&&day>28) 
				{
					System.out.println("In");
				}
				
				
				else
				{
					d1 = utility.DayOfWeek(day, month, year);		
					System.out.println("d1=" +d1);
				}
			
			}

	      }

		}
		scanner.close();
	}
	
}
