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
		Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int h=1;h<=count;h++) {
            int a=sc.nextInt();
            float b= sc.nextFloat();
            int c=sc.nextInt();
            if(a>50&&b<0.7&&c>5600){
                System.out.println("10");
            }
            else if(a>50&&b<0.7){
                System.out.println("9");
            }
            else if(b<0.7&&c>5600){
                System.out.println("8");
            }
            else if(a>50&&c>5600){
                System.out.println("7");
            }
            else if(a>50||b<0.7||c>5600){
                System.out.println("6");
            }
            else{
                System.out.println("5");
            }
        }
	}
}
