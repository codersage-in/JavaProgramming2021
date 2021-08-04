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
	for(int i =0;i<noOfInputs;i++){
	    String number = input.next();
	    int sum =0;
	    for(int j =0; j<number.length(); j++){
	        sum= sum + (number.charAt(j)-'0');
	    }
	    System.out.println(sum);
	}
	}
}
