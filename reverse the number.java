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
        int n,number,rev;
        n=sc.nextInt();
        if(n>=1 && n<=1000){
            for(int i=0;i<n;i++){
                number=sc.nextInt();
                rev=0;
                if(number>=1 && number<=1000000)
                {
                    while(number>0){
                        int rem=number%10;
                        rev=rev*10+rem;
                        number=number/10;
                    }
                }
                System.out.println(rev);
            }
        }

    }
}
