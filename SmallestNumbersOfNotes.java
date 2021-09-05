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
        while(t-- > 0)
        {
            int a = s.nextInt();
            int cnt = 0;
            if(a >= 100)
            {
                cnt += (a/100);
                a %= 100;
            }
            if(a >= 50)
            {
                cnt += (a/50);
                a %= 50;
            }
            if(a >= 10)
            {
                cnt += (a/10);
                a %= 10;
            }
            if(a >= 5)
            {
                cnt += (a/5);
                a %= 5;
            }
            if(a >= 2)
            {
                cnt += (a/2);
                a %= 2;
            }
            if(a >= 1)
            {
                cnt += (a/1);
                a %= 1;
            }
            System.out.println(cnt);
        }
	}
}
