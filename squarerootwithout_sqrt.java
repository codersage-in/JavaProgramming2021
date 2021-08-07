import java.util.*;
public class squarerootwithout_sqrt
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner (System.in);
        int N = S.nextInt();
        double temp;
        double squareroot = N/2;
        do
        {
            temp=squareroot;
            squareroot = (temp+(N/temp))/2;   
        }
        while((temp-squareroot)!=0);
        System.out.println("squareroot="+squareroot);
    }
}
