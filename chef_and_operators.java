import java.util.Scanner;
public class chef_and_operators {
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(;t>0;t--)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            if(a<b)
                System.out.println("<");
            else if(a>b)
                System.out.println(">");
            else if(a==b)
                System.out.println("=");
        }
    }
}
