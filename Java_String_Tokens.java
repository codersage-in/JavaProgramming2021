import java.util.*;
public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if(s.length() == 0)
        {
            System.out.println(0);
        }
        else
        {
            String arr[]=s.split("[ !,?._'@]+");
            System.out.println(arr.length);
               for(int i=0;i<arr.length;i++)
                {
                    System.out.println(arr[i]);
                } 
        }
            scan.close(); 
    }
}