package com.bridglelabz.utilityStatic;

public class utilityMath {
	
	public static void PrintHarmonic(int n) 
	{
		double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
	}
	
	/**
	 * @param radiun
	 * @return
	 */
	public static double findSin(double radiun) {
		radiun = Math.toRadians(radiun);
		return Math.sin(radiun);
	}
	

	public static double findCos(double radiun) {
		radiun = Math.toRadians(radiun);
		return Math.cos(radiun);
	}
	
	/**
	 * @param n
	 */
	public static void Binary(int n)
	{
		int a;
		String x ="";
		if(n>255)
		{
			System.out.println("Invalid input");
		}
		else
		{
			
		while(n>0)
		{
			a=n%2;
			x = a + "" + x;
			n=n/2;
		}
		System.out.println("Binary is = " +x);
	}
	}
	
	/**
	 * @param c
	 * @return
	 */
	public static double findSquareRootUsingNewtonsMethod(int c)
	{
		double t, epsilon;
		t = c;
		epsilon=1*(Math.pow(10, -15));
		epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}
	
	/**
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
		return false;
		} else {
		for (int i = 2; i <= number / 2; i++) {
		if (number % i == 0) {
		return false;
		}
		}
		return true;
		}

		}
	
	/**
	 * @param number
	 * @return
	 */
	public static int CalculateFactorial(int number) {
		int fact=1;
		for (int i=1;i<=number;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static void Stopwatch() {
       double start = System.currentTimeMillis();
    } 


    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public static double elapsedTime() {
    	double start = System.currentTimeMillis();
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

}
