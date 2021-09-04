/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int lucky=0;
        int unlucky=0;
        int n = sc.nextInt();
        int []a=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(a[j]%2==0)
            {
                lucky++;
            }
            else
            {
                unlucky++;
            }
        }
        if (lucky>unlucky)
        {
            System.out.println("READY FOR BATTLE");
        }
        else
        {
            System.out.println("NOT READY");
        }

    }
		
	
}