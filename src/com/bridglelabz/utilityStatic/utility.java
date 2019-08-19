package com.bridglelabz.utilityStatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class utility {

	public static boolean areAnagram(char[] str1, char[] str2) {
		// Get lenghts of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	/**
	 * @param str1
	 * @return
	 */
	public static boolean Palindrome(String str1) {
		String rev = "";
		int n1 = str1.length() - 1;
		for (int i = n1; i >= 0; i--)

			rev = rev + str1.charAt(i);
		if (str1.equals(rev))
			return true;
		else
			return false;

	}

	static List<String> listRecursive = new ArrayList<String>();

	public static void permute(String str, int low, int high) {
		if (low == high) {
			System.out.println(str);
			listRecursive.add(str);
		} else {
			for (int i = low; i <= high; i++) {
				str = swap(str, low, i);
				// System.out.println("x="+str);
				permute(str, low + 1, high);
				str = swap(str, low, i);
				// System.out.println("y="+str);
			}
		}
	}

//method to swap string
	/**
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void swap1(char[] a, int i, int j) {
		char ch = a[i];
		a[i] = a[j];
		a[j] = ch;
	}

	static List<String> listIterative = new ArrayList<String>();

	public static void permutations(String s) {
		// convert string to a character array (Since String is immutable)
		char[] chars = s.toCharArray();

		// Weight index control array
		int[] p = new int[s.length()];

		// i, j represents upper and lower bound index resp. for swapping
		int i = 1, j = 0;

		// Print given string, as only its permutations will be printed later
		System.out.print(s);
		listIterative.add(s);
		while (i < s.length()) {
			if (p[i] < i) {
				// if i is odd then j = p[i], otherwise j = 0
				j = (i % 2) * p[i];

				// swap(a[j], a[i])
				swap1(chars, i, j);

				// Print current permutation
				System.out.print(" " + String.valueOf(chars));
				listIterative.add(String.valueOf(chars));
				p[i]++; // increase index "weight" for i by one
				i = 1; // reset index i to 1
			}
			// otherwise p[i] == i
			else {
				// reset p[i] to zero
				p[i] = 0;

				// set new index value for i (increase by one)
				i++;
			}
		}
	}

	public static void compareList()
	{
		Collections.sort(listIterative);
		Collections.sort(listRecursive);
		if((listIterative).equals(listRecursive)){
			System.out.println("lists are equal");
		}
		else
		{
		System.out.println("the lists are not equal");	
		}
	}
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public static int DayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;

	}
	/**
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        if  (year % 400 == 0) return true;
        return false;
    }
	
	/**
	 * @author slot2
	 *
	 */
	public final static class StdRandom {

	    private static Random random;    // pseudo-random number generator
	    private static long seed;        // pseudo-random number generator seed

	 // static initializer
	   static { 
	        // this is how the seed was set in Java 1.4
	        seed = System.currentTimeMillis();
	        random = new Random(seed);
	}
	        
	        private StdRandom() { }

	        /**
	         * Sets the seed of the pseudo-random number generator.
	         * This method enables you to produce the same sequence of "random"
	         * number for each execution of the program.
	         * Ordinarily, you should call this method at most once per program.
	         *
	         * @param s the seed
	         */
	        public static  void setSeed(long s) {
	            seed   = s;
	            random = new Random(seed);
	        }
	        
	        /**
	         * Returns the seed of the pseudo-random number generator.
	         *
	         * @return the seed
	         */
	        public static long getSeed() {
	            return seed;
	        }

	        public static double uniform() {
	            return random.nextDouble();
	        }

	        /**
	         * Returns a random integer uniformly in [0, n).
	         * 
	         * @param n number of possible integers
	         * @return a random integer uniformly between 0 (inclusive) and {@code n} (exclusive)
	         * @throws IllegalArgumentException if {@code n <= 0}
	         */
	        public static int uniform(int n) {
	            if (n <= 0) throw new IllegalArgumentException("argument must be positive: " + n);
	            return random.nextInt(n);
	        }
	        
	        public static double uniform(double a, double b) {
	            if (!(a < b)) {
	                throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");
	            }
	            return a + uniform() * (b-a);
	        }

	        /**
	         * Returns a random boolean from a Bernoulli distribution with success
	         * probability <em>p</em>.
	         *
	         * @param  p the probability of returning {@code true}
	         * @return {@code true} with probability {@code p} and
	         *         {@code false} with probability {@code 1 - p}
	         * @throws IllegalArgumentException unless {@code 0} &le; {@code p} &le; {@code 1.0}
	         */
	        public static boolean bernoulli(double p) {
	            if (!(p >= 0.0 && p <= 1.0))
	                throw new IllegalArgumentException("probability p must be between 0.0 and 1.0: " + p);
	            return uniform() < p;
	        }
	        /**
	         * @return
	         */
	        public static boolean bernoulli() {
	            return bernoulli(0.5);
	        }
	        
	        public static double gaussian() {
	            // use the polar form of the Box-Muller transform
	            double r, x, y;
	            do {
	                x = uniform(-1.0, 1.0);
	                y = uniform(-1.0, 1.0);
	                r = x*x + y*y;
	            } while (r >= 1 || r == 0);
	            return x * Math.sqrt(-2 * Math.log(r) / r);

	            // Remark:  y * Math.sqrt(-2 * Math.log(r) / r)
	            // is an independent random gaussian
	        }

	        /**
	         * Returns a random real number from a Gaussian distribution with mean &mu;
	         * and standard deviation &sigma;.
	         * 
	         * @param  mu the mean
	         * @param  sigma the standard deviation
	         * @return a real number distributed according to the Gaussian distribution
	         *         with mean {@code mu} and standard deviation {@code sigma}
	         */
	        public static double gaussian(double mu, double sigma) {
	            return mu + sigma * gaussian();
	        }
	        
	        /**
	         * @param probabilities
	         * @return
	         */
	        public static int discrete(double[] probabilities) {
	            if (probabilities == null) throw new IllegalArgumentException("argument array is null");
	            double EPSILON = 1.0E-14;
	            double sum = 0.0;
	            for (int i = 0; i < probabilities.length; i++) {
	                if (!(probabilities[i] >= 0.0))
	                    throw new IllegalArgumentException("array entry " + i + " must be nonnegative: " + probabilities[i]);
	                sum += probabilities[i];
	            }
	            if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)
	                throw new IllegalArgumentException("sum of array entries does not approximately equal 1.0: " + sum);

	            // the for loop may not return a value when both r is (nearly) 1.0 and when the
	            // cumulative sum is less than 1.0 (as a result of floating-point roundoff error)
	            while (true) {
	                double r = uniform();
	                sum = 0.0;
	                for (int i = 0; i < probabilities.length; i++) {
	                    sum = sum + probabilities[i];
	                    if (sum > r) return i;
	                }
	            }
	        }
	        
	        public static void shuffle(Object[] a) {
	            validateNotNull(a);
	            int n = a.length;
	            for (int i = 0; i < n; i++) {
	                int r = i + uniform(n-i);     // between i and n-1
	                Object temp = a[i];
	                a[i] = a[r];
	                a[r] = temp;
	            }
	        }

			private static void validateNotNull(Object[] a) {
				// TODO Auto-generated method stub
				
			}

	    
	    
	    
	}

}
