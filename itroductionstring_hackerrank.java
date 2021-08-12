import java.util.*;

class introductionstring_hackerrank
{

    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        String A = S.next();
        String B = S.next();
        System.out.println( A.length() + B.length() );
        int i = A.compareTo(B);
        if(i<0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1,5) + " " + B.substring(0, 1).toUpperCase() + B.substring(1)
        );
    }
}
