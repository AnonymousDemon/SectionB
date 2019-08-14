package com.bridglelabz.utilityStatic;

import java.util.Arrays;

public class utility {
	

	public static boolean areAnagram(char[] str1, char[] str2) 
    { 
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

	public static boolean Palindrome(String str1)
	{
		String rev="";
		int n1=str1.length()-1;
		for(int i=n1;i>=0;i--)
		
			rev = rev + str1.charAt(i);
			if(str1.equals(rev))
				return true;
			else
				return false;
		
		
	}
}
