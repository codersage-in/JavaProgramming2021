import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int i = 0 ; i < t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    GCD(a,b);
		    
		}
	}
	public static void GCD(int n1 , int n2){
	    int gcd =0;
	    long lcm = 0;
	    int min =Math.min(n1, n2);
		int max = Math.max(n1, n2);
		int dividend =max;
		int divisior =min;
		while(true) {
			
			int remainder=dividend % divisior;
			if(remainder==0) {
				break;
			}
			dividend = divisior;
			divisior = remainder;
		}
		gcd = divisior;
	    lcm = ((long) n1 *n2)/gcd;
	    System.out.println(gcd+" "+lcm);
	}

}