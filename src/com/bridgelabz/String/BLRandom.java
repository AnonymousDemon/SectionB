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
//	        if (args.length == 2) 
//	        	utility.StdRandom.setSeed(Long.parseLong(args[1]));
	        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
//	       // int[] frequencies = { 5, 3, 1, 1 };
//	        String[] a = "A B C D E F G".split(" ");
//	        
//	        System.out.print("Type a string: ");
//	        String s = utility.StdRandom.readString();
//	        System.out.println("Your string was: " + s);
//	        System.out.println();
//
//	        System.out.print("Type an int: ");
//	        int a1 = utility.StdRandom.readInt();
//	        System.out.println("Your int was: " + a1);
//	        System.out.println();
//
//	        System.out.print("Type a boolean: ");
//	        boolean b = utility.StdRandom.readBoolean();
//	        System.out.println("Your boolean was: " + b);
//	        System.out.println();
//
//	        System.out.print("Type a double: ");
//	        double c = utility.StdRandom.readDouble();
//	        System.out.println("Your double was: " + c);
//	        System.out.println();

	        
	        System.out.println("seed = " + utility.StdRandom.getSeed());
	        for (int i = 0; i < n; i++) {
	            System.out.printf("%2d ",   utility.StdRandom.uniform(100));
	            System.out.printf("%8.5f ", utility.StdRandom.uniform(10.0, 99.0));
	            System.out.printf("%5b ",   utility.StdRandom.bernoulli(0.5));
	            System.out.printf("%7.5f ", utility.StdRandom.gaussian(9.0, 0.2));
	            System.out.printf("%1d ",   utility.StdRandom.discrete(probabilities));
	           
	            
	            
	            sc.close();

	}
	}

}
