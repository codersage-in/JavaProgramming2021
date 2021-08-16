import java.util.*;
public class Enormous_Input_Test {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int t=n;
        int k=s.nextInt();
        int cnt=0;
        int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
                if(arr[i]%k==0)
                cnt++;  
            }
            System.out.println(cnt);
            s.close();
    }
}
