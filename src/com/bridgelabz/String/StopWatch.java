package com.bridgelabz.String;

import java.util.Scanner;

import com.bridglelabz.utilityStatic.utility;
import com.bridglelabz.utilityStatic.utility.Stopwatch;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		    
		    /**
		     * Unit tests the {@code Stopwatch} data type.
		     * Takes a command-line argument {@code n} and computes the 
		     * sum of the square roots of the first {@code n} positive integers,
		     * first using {@code Math.sqrt()}, then using {@code Math.pow()}.
		     * It prints to standard output the sum and the amount of time to
		     * compute the sum. Note that the discrete sum can be approximated by
		     * an integral - the sum should be approximately 2/3 * (n^(3/2) - 1).
		     *
		     * @param args the command-line arguments
		     */
		   
		        int n ;

		        Scanner sc = new Scanner(System.in);
		        n=sc.nextInt();
		        // sum of square roots of integers from 1 to n using Math.sqrt(x).
		       int  timer1 = 1;
		        double sum1 = 0.0;
		        for (int i = 1; i <= n; i++) {
		            sum1 += Math.sqrt(i);
		        }
		        double time1 =0;
		        System.out.printf("%e (%.2f seconds)\n", sum1, time1);

		        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
		        Stopwatch timer2 = null;
		        double sum2 = 0.0;
		        for (int i = 1; i <= n; i++) {
		            sum2 += Math.pow(i, 0.5);
		        }
		        
		        double time2 = timer2.elapsedTime();
		        System.out.printf("%e (%.2f seconds)\n", sum2, time2);
	}

}
