import java.util.*;
public class Java_Strings_Introduction {
    public static void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        String sa=A.substring(0,1).toUpperCase();
        String sb=B.substring(0,1).toUpperCase();
        System.out.println(sa+A.substring(1,A.length())+" "+sb+B.substring(1,B.length()));
    }
}
