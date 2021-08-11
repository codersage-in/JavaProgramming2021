import java.util.*;
public class Java_String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        int l=A.length();
        boolean f=true;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0;i<l/2;i++)
        {
            if( A.charAt(i) != A.charAt(l-i-1))
            {
                f=false;
                break;
            }
        }
        System.out.println(f==true?"Yes":"No");
    }
}
