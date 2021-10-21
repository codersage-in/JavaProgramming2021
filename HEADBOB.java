import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
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

        int T = sc.nextInt();
        while(T-- > 0){
            int  N = sc.nextInt();
            String str = sc.next();
            if(str.contains("I"))
            {
                System.out.println("INDIAN");
            }else if(str.contains("Y"))
            {
                System.out.println("NOT INDIAN");
            }else
            {
                System.out.println("NOT SURE");
            }
        }
	}
}