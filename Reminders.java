//No template exists for this language. Erase this and please write full code.
import java.util.*;
class Codesafe{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b;
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            int rem=a%b;
            System.out.println(rem);
            rem=0;
        }
    }
}