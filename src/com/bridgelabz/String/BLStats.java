package com.bridgelabz.String;

import com.bridglelabz.utilityStatic.UtilityStats;

public class BLStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a[]= {1,2,3,4};
		System.out.println( "Max = "+UtilityStats.max(a));
		System.out.println( "Min = "+UtilityStats.min(a));
		System.out.println( "Var = "+UtilityStats.var(a));
		System.out.println( "Std dev = "+UtilityStats.stddev(a));
		System.out.println( "Median = "+UtilityStats.median(a));

		



	}

}
