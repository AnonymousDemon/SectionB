package com.bridgelabz.String;

import java.util.Scanner;

import com.bridglelabz.utilityStatic.utilityMath;

public class MathFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb;
		double radiun;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no");;
		numb = scanner.nextInt();
		System.out.println("Enter angle");;
		radiun = scanner.nextDouble();

		
		//Harmonic number
		System.out.print("Harmonic number is : ");
		utilityMath.PrintHarmonic(numb);
		
		//sin of angle
		System.out.println("Sin angle =");
		System.out.println(utilityMath.findSin(radiun));
		//cos of angle
		System.out.println("Cos angle =");
		System.out.println(utilityMath.findCos(radiun));

		//binary
		
		utilityMath.Binary(numb);
		//square root using newton
		System.out.print("Sqaure root using newtons method is = ");
		System.out.println(utilityMath.findSquareRootUsingNewtonsMethod(numb));
		
		//Prime number
		System.out.println("Number " + numb+ "is Prime = ");
		System.out.print(utilityMath.isPrime(numb));
		
		System.out.println("Factorial =");
	
		System.out.print(utilityMath.CalculateFactorial(numb));
		scanner.close();
	}

}
