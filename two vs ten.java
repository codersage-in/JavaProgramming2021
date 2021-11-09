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
        while(t-- != 0) {
            int count = 0;
            String s = sc.next();

            int b = Integer.parseInt(s.substring(s.length()-1));
            if(b == 0 || b== 5) {
                
                while(b%10 != 0) {
                    b = b*2;
                    count++;
                }
                System.out.println(count);
            }else {
                System.out.println("-1");
            }
        }
        
    }

}