/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number;
        for(int i=0;i<num;i++)
        {
            int cnt=0,sum=0;
            number=sc.nextInt();
            int n1=number;
            int last=number%10;
            while(number>0){
                int r=number%10;
                cnt++;
                number=number/10;
            }
            int first=(int)(n1/Math.pow(10,cnt-1));
            sum=sum+first+last;
            System.out.println(sum);
        }
		


	}
}
