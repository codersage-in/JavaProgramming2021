/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner input=new Scanner(System.in);
        int noOfInput = input.nextInt();

        for(int count=0;count<noOfInput;count++){
            String data=input.next();
            int sum=0;
            for(int CharCount=0;CharCount<data.length();CharCount++){
                sum = sum +(data.charAt(CharCount)-'0');
            }
            System.out.println(sum);
        }
	}
}
