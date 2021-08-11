import java.util.*;
public class Java_Loop_1 {
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        s.close();
        for(int i=1;i<=10;i++)
        System.out.println(N + " x " + i + " = " + (N*i));   
    }
}
