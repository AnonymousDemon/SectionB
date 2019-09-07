package com.bridgelabz.pattern;

public class Pascal {

	// Function to print first 
    // n lines of Pascal's Triangle 
	//Method1
	static void printPascal(int n) 
    { 
          
    // Iterate through every line 
    // and print entries in it 
    for (int line = 0; line < n; line++) 
    { 
        // Every line has number of  
        // integers equal to line number 
        for (int i = 0; i <= line; i++) 
        System.out.print(binomialCoeff 
                        (line, i)+" "); 
                          
        System.out.println(); 
    } 
    } 
	  
    // Link for details of this function 
    // https://www.geeksforgeeks.org/space-and-time-efficient-binomial-coefficient/ 
    static int binomialCoeff(int n, int k) 
    { 
        int res = 1; 
          
        if (k > n - k) 
        k = n - k; 
              
        for (int i = 0; i < k; ++i) 
        { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
        return res; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7; 
	    printPascal(n); 
	    printPascal1(n);
	    printPascal2(n);

	}

	//Method2
	public static void printPascal1(int n) 
	{ 
	// An auxiliary array to store generated pascal triangle values 
	int[][] arr = new int[n][n];  
	  
	// Iterate through every line and print integer(s) in it 
	for (int line = 0; line < n; line++) 
	{ 
	    // Every line has number of integers equal to line number 
	    for (int i = 0; i <= line; i++) 
	    { 
	    // First and last values in every row are 1 
	    if (line == i || i == 0) 
	        arr[line][i] = 1; 
	    else // Other values are sum of values just above and left of above 
	        arr[line][i] = arr[line-1][i-1] + arr[line-1][i]; 
	    System.out.print(arr[line][i]+" "); 
	    } 
	    System.out.println(" "); 
	}
	
	
	} 
	//Pascal function  
	//Method3
	public static void printPascal2(int n) 
	{ 
	    for(int i = 1; i <= n; i++) 
	    { 
	          
	    int C=1;// used to represent C(line, i) 
	    for(int j = 1; j <= i; j++) 
	    {  
	        // The first value in a line is always 1 
	        System.out.print(" "+C+" "); 
	        C = C * (i - j) / j;  
	    } 
	    System.out.println(); 
	    } 
	    }
}
