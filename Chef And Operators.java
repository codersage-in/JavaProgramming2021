/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a<b){
                System.out.println("<");
            }else if(a==b){
                System.out.println("=");
            }else if(a>b){
                System.out.println(">");
            }
        }
    }
}
      