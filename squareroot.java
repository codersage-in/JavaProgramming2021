/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int nooftest=sc.nextInt();

        for(int i=0;i<nooftest;i++)
        {
            int x = sc.nextInt();
            int result=(int)Math.sqrt(x);
            System.out.println(result);
        }
	}
}
