import java.util.*;
public class plus_minus 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int P=0,N=0,Z=0;
        int a;
        for(int i=0;i<n;i++)
        {
            a = sc.nextInt();
            if(a==0)
            {Z++;}
            else if(a>0)
            {P++;}
            else{N++;}
        } 
        System.out.println(P / (double) n);
        System.out.println(N / (double) n);
        System.out.println(Z / (double) n);
        sc.close();
    }    
}
