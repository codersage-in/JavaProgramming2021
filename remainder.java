import java.util.Scanner;

public class remainder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rem[]=new int [n];
        for(int i=0; i<n; i++)
        {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            rem[i]=n1%n2;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(rem[i]);
        }
        sc.close();
    }
}
