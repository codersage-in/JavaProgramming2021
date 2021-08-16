import java.util.*;
public class Decrement_Or_Increment {
    public static void main(String arr[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(n%4==0)
        System.out.println(++n);
        else
        System.out.println(--n);
    }
}
