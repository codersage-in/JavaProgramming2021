import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		char v= sc.next().charAt(0);
		if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
		{
		    System.out.println("Vowel");
		}
		else
		{
		    System.out.println("Consonant");
		}
	}
}