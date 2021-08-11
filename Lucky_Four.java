import java.util.*;
public class Lucky_Four {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(;t>0;t--)
        {
            int count=0;
            int n=s.nextInt();
            //take digit from last and compare
            for(;n>0;n/=10)
            {
                if(n%10 == 4)
                    count++;
            }
            System.out.println(count);
        }
    }
}
