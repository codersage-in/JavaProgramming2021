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
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int p = s.nextInt();
            int menu=0;
            for(int i=11;i>=0;i--){
                    int curr_pow = (int)Math.pow(2,i);
                    while(p>=curr_pow){
                        p -= curr_pow;
                        menu++;
                    }
            }
            System.out.println(menu);
        }
        s.close();
	}
}
