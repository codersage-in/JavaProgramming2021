import java.util.*;
public class blockgame 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int a=sc.nextInt();
            int real=a,r,num=0;
            while(a!=0)
            {
                r=a%10;
                num=(num*10)+r;
                a=a/10;
            }
            if(num==real)
            {
                System.out.println("wins");
            }
            else
            {
                System.out.println("loses");
            }
        }
        sc.close();
    }
}
