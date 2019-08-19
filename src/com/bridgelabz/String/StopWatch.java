package com.bridgelabz.String;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter");
		 n= sc.nextInt();

	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
	        StopWatch timer1 = new StopWatch();
	        double sum1 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum1 += Math.sqrt(i);
	        }
	     //   double time1 = utilityMath.elapsedTime();
	       // System.out.printf("%e (%.2f seconds)\n", sum1, time1);

	        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
	        StopWatch timer2 = new StopWatch();
	        double sum2 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum2 += Math.pow(i, 0.5);
	        }
	     //   double time2 = timer2.elapsedTime();
	      //  System.out.printf("%e (%.2f seconds)\n", sum2, time2);
		
	}

}
