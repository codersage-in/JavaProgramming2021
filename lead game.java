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
		int rounds = sc.nextInt();
		int total1 =0;
		int total2 = 0;
		int winner =0, lead =0;
		for(int i = 0; i < rounds; i++){
		    int player1 = sc.nextInt();
		    int player2 = sc.nextInt();
		    total1 += player1;
		    total2 += player2;
		    if(total1 > total2 && (total1 - total2) > lead){
		        winner = 1;
		        lead = total1 - total2;
		    }else if(total2 > total1 && (total2 - total1) > lead){
		        winner = 2;
		        lead = total2 - total1;
		    }
		}
		System.out.println(winner + " " + lead);
	}
}
