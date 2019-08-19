package com.bridgelabz.String;

import java.util.Scanner;

import com.bridglelabz.utilityStatic.utility;

public class BLRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enyer n");
		 n= sc.nextInt();
	        if (args.length == 2) 
	        	utility.StdRandom.setSeed(Long.parseLong(args[1]));
	        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
	       // int[] frequencies = { 5, 3, 1, 1 };
	        String[] a = "A B C D E F G".split(" ");

	        System.out.println("seed = " + utility.StdRandom.getSeed());
	        for (int i = 0; i < n; i++) {
	            System.out.printf("%2d ",   utility.StdRandom.uniform(100));
	            System.out.printf("%8.5f ", utility.StdRandom.uniform(10.0, 99.0));
	            System.out.printf("%5b ",   utility.StdRandom.bernoulli(0.5));
	            System.out.printf("%7.5f ", utility.StdRandom.gaussian(9.0, 0.2));
	            System.out.printf("%1d ",   utility.StdRandom.discrete(probabilities));
	           
	            
	            utility.StdRandom.shuffle(a);
	            for (String s : a)
	                System.out.print(s);
	            System.out.println();
	            sc.close();

	}
	}

}
