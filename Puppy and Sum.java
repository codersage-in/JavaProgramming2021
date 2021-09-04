/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = 0;
        for(int i=0; i<t; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            
            
            for(int x=1; x<=n1; x++) {
                s = 0;
                for(int j=1; j<=n2; j++) {
                    s += j;
                }
                n2 = s;
            }
            System.out.println(s);
        }
        sc.close();
    }
}