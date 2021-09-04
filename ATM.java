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
	    float withdraw = sc.nextFloat();
	    float balance = sc.nextFloat();
	    sc.close();
	    if((withdraw + 0.50) > balance){
	        System.out.printf("%.2f", balance);
	        return;
	    }
	    if(withdraw % 5 == 0){
	        System.out.printf("%.2f",((balance - withdraw)-0.50));
	        return;
	    }
	    else{
	        System.out.printf("%.2f", balance);
	        return;
	    }
	}
}