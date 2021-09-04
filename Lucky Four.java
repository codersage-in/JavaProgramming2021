import java.util.*;
class sumofdigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int count=0;
            int n=sc.nextInt();
            while(n>0)
            {
                int rem=n%10;
                if(rem==4)
                {
                    count++;
                }
                n=n/10;
            }
            System.out.println(count);
            
        }
    }
}