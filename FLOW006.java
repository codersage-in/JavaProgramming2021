/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int noOfInputs = input.nextInt();
	    
	    for (int i=0; i<noOfInputs ;i++ ){
	        String number = input.next(); // 135 (1 + 3 + 5)
	        int sum = 0;
	   
	    // how to get individual digits from the Input
	    for(int j =0; j<number.length(); j++){
	        // Do addition of the digits
	        sum = sum + (number.charAt(j) - '0'); //chat 1 corresponding ascii value
	    }
	    
		System.out.println(sum);
	    }
	}
}
