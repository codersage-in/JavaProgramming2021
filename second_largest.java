import java.util.Scanner;
public class second_largest {
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(;t>0;t--)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int largest=(a>b && a>c)?a:(b>c?b:c);
            int lowest=(a<b && a<c)?a:(b<c?b:c);
            if(a<largest && a>lowest)
                System.out.println(a);
            else if(b<largest && b>lowest)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
