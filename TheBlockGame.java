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
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int rem=0;
        while(t-- > 0)
        {
            int n = s.nextInt();
            int temp = n;
            int reverse_num=0;
            while(n != 0)
            {
                rem = n % 10;
                reverse_num = reverse_num * 10 + rem;
                n /= 10; 
            }
            if(temp == reverse_num)
            System.out.println("wins");
            else
            System.out.println("loses");
        }
	}
}
