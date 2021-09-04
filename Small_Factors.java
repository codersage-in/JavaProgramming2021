import java.util.*;
public class Small_Factors {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int mul=1;
        for(int i=1;i<=num;i++){
            mul=1;
            int aa=sc.nextInt();
            for(int j=1;j<=aa;j++){
                mul=mul*j;
            }
            System.out.println(mul);
        }
    }
}
