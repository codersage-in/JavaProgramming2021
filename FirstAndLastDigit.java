/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner input = new Scanner(System.in);
		int NoOfInputs = input.nextInt();
		
		for(int i = 0; i < NoOfInputs; i++){
		    int number = input.nextInt();
		    int first = number;
		    int sum = 0;
		    
		    while(first >= 10){
		        first = first / 10;
		    }
		    
		    int last = number % 10;
		    
		    sum = first + last;
		    
		    System.out.println(sum);
		}
	}
}
