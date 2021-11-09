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
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String s1=sc.next();
            String s2=sc.next();
            int c=0,t=0;
            for(int i=0;i<s1.length();i++)
            {
                if( (s1.charAt(i)=='?' && s2.charAt(i)=='?') || (s1.charAt(i)=='?' && s2.charAt(i)!='?')|| (s2.charAt(i)=='?' && s1.charAt(i)!='?'))
                    c++;
              else  if(s1.charAt(i)!=s2.charAt(i) && s1.charAt(i)!='?' && s2.charAt(i)!='?')
                   t++;
            }
            System.out.println(t+" "+(t+c));

            }
    }
}