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
        int n = s.nextInt();
        s.close();
        int cnt=0;
        while(n!=0)
        {
            n/=10;
            cnt++;
            if(cnt>3)
            break;
        }
        String ans = (cnt==1)?"1":(cnt==2?"2":(cnt==3?"3" : "More than 3 digits"));
        System.out.println(ans);
	}
}
