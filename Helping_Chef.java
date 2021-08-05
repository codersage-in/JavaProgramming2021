import java.util.Scanner;
public class Helping_Chef {
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            if(n<10)
                System.out.println("Thanks for helping Chef!");
            else
                System.out.println("-1");
        }
    }
}
