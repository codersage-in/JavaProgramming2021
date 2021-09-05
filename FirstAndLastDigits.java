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
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=s.nextInt();
            int sum=(x%10);
            int temp=0;
            while(x>0){
                temp=x%10;
                x/=10;
            }
            sum+=temp;
            System.out.println(sum);
        }
	}
}
