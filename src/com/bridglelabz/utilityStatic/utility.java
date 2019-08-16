package com.bridglelabz.utilityStatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

}
