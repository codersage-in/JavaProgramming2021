import java.util.*;
public class The_Lead_Game {
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int sum1=0,sum2=0;
        int lr[]=new int[t];
        int player[]=new int[t];
        for(int i=0;i<t;i++)
        {
            sum1+=s.nextInt();
            sum2+=s.nextInt();
            int diff=Math.abs(sum1-sum2);
            lr[i]=diff;
            if(sum1>sum2)
                player[i]=1;
            else
                player[i]=2;
        }
        int max=0,winner=0;
        for(int i=0;i<t;i++)
        {
            if(lr[i]>max)
            {
                max=lr[i];
                winner=player[i];
            }
        }
        System.out.println(winner+" "+max);
    }
    }
