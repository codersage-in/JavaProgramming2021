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
        int ts = sc.nextInt();

        for (int t = 0; t < ts; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            // boolean ain = false;

            // for (int i = 0; i < n; i++) {
            //     if (ain) {
            //         b = b * 2;
            //         ain = false;
            //     } else {
            //         a = a * 2;
            //         ain = true;
            //     }
            // }
            if(n%2 != 0) a = a * 2;

            System.out.println(Math.max(a, b) / Math.min(a, b));
        }
	}
}

