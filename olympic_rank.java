import java.util.*;
public class olympic_rank 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int c1_1=sc.nextInt();
            int c1_2=sc.nextInt();
            int c1_3=sc.nextInt();
            int c2_1=sc.nextInt();
            int c2_2=sc.nextInt();
            int c2_3=sc.nextInt();
            int sum1=c1_1+c1_2+c1_3;
            int sum2=c2_1+c2_2+c2_3;
            if(sum1>sum2)
            {
                System.out.println("1");
            }
            else 
            {
                System.out.println("2");
            }
        }
        sc.close();
    }
}
