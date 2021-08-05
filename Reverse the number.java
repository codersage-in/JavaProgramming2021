import java.util.*;
import java.lang.*;
import java.io.*;
 class reverse_the_number {
    public static void main(String[] args)
    {
        int n , rev , a=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int reverse[]= new int[n];

        for(int i=0 ; i<n ; i++)
        {
            reverse[i]=sc.nextInt();
        }
        for(int i=0 ; i<n ;i++)
        {
            a=0 ;
            while(reverse[i]!=0)
            {
                rev=reverse[i]%10 ;
                a=a*10 + rev ;
                reverse[i]=reverse[i]/10 ;
            }
            System.out.println(a);
        }



    }
}
