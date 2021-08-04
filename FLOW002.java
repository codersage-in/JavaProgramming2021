import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int NoOfInputs = input.nextInt();
		
		for(int i = 0; i < NoOfInputs; i++){
		    int number1 = input.nextInt();
		    int number2 = input.nextInt();
		    
		    int ans = number1 % number2;
		    System.out.println(ans);

		    
		}
		
	}
}
