/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//take input
		Scanner input= new Scanner(System.in);
		int noOfInputs = input.nextInt();
		
		for (int i=0; i < noOfInputs; i++){ 
		String number = input.next();
		int sum =0;
		// how to get individual unit from input
		for(int j=0; j<number.length(); j++){
		    //do addition of digits
		 sum = sum + (number.charAt(j) - '0');  
		
		}
		System.out.println(sum);
		}
	}
}
