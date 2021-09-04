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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    boolean flag = true;
		    for(int i = 2; i < n;i++){
		        if(n%i == 0){
		            flag = false;
		            break;
		        }
		    }
		    if(n == 1){
		        System.out.println("no");
		    }
		    else if(n <= 3){
		        System.out.println("yes");
		    }
		   else if(flag == true){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}