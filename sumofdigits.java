import java.util.Scanner;
public class sumofdigits
{
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount of numbers:");
        int noofimputs = input.nextInt();
        for(int i=0;i<noofimputs;i++)
        {
           String numbers = input.next();
           int sum=0;
           for(int charcounter=0;charcounter<numbers.length();charcounter++)
           {
                sum=sum + (numbers.charAt(charcounter)-'0');
           }
            System.out.println(sum);

        }


    }

}
