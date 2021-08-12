import java.util.*;
public class stringtokens 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();
        if(s.compareTo("")== 0)
         {
             System.out.println(0);
         }
         else
         {
         String arrayStr[] = s.trim().split("[ !,?._'@]+");
         System.out.println(arrayStr.length);
         for(int i = 0;i<arrayStr.length;i++)
         {
                System.out.println(arrayStr[i]);
         }
         }
        scan.close();
    }
}
