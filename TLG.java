import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheLeadGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] Arr = new int[num];
		int win=0;
		int max=0;
		int P1 = 0;
		int P2 = 0;
		
		
		for(int i=0 ; i<num ; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    P1+=a;
		    P2+=b;
		    if(Math.abs(P1-P2)>max){
		        max=Math.abs(P1-P2);
		        if(a>b) win=1;
		        else win=2;
		    } 
		}       

		System.out.println(win+ " " +max);
                 
	}
}