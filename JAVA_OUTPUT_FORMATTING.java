import java.util.Scanner;
public class JAVA_OUTPUT_FORMATTING
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=S.next();
            int A =S.nextInt();
            System.out.printf("%-14s %10d\n", s1, A);
        }
        System.out.println("================================");

    }
}