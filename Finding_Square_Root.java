import java.util.*;
public class Finding_Square_Root {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int a,b,c;
        for(int i=1;i<=num;i++){
            a=sc.nextInt();
            b=((a/2)+(a/(a/2)))/2;
            c=(b+(a/b))/2;
            System.out.println(c);
        }
    }
}
