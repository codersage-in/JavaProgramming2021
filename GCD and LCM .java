import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
public static void main (String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int i = 0 ; i < t; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    GCD(x,y);
		    
		}
	}
	public static void GCD(int n1 , int n2){
	    int gcd =0;
	    long lcm = 0;
	    int minimum =Math.min(n1, n2);
		int maximum = Math.max(n1, n2);
		int dividend =maximum;
		int divisior =minimum;
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
