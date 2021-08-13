import java.util.Scanner;

public class TheLeadGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []p1=new int[10];
        int []p2=new int[10];
        int w=0,l=0;
        //taking user input
        for(int i=0;i<n;i++)
        {
        p1[i] = sc.nextInt();
        p2[i] = sc.nextInt();
        }
        //for winner
        if(p1[0]>p2[0])
        {
            w=1;
        }
        else if (p1[0]<p2[0])
        {
            w=2;
        }
        //for lead
        if(p1[0]>p2[0])
        {
            l=p1[0]-p2[0];
        }
        else if (p1[0]<p2[0])
        {
            l=p2[0]-p1[0];
        }
        System.out.format("%d %d",w,l);

    }
}
