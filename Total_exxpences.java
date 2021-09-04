package Code_chef;
 
 import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Total_exxpences 
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         Scanner sc =new Scanner(System.in);
              int n=sc.nextInt();
              for(int i=0;i<n;i++)
              {
                  double a=sc.nextDouble();
                  double b=sc.nextDouble();
                  if(a>1000){
                      System.out.println(a*b-(a*b)/10);
                  }
                  else{
                      System.out.println(a*b);
                  }
              }
     }
 }

