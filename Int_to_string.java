import java.util.*;

public class Int_to_string
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner (System.in);
        int Num = 100;
        String s = Integer.toString(Num);
        if(Num==Integer.parseInt(s))
        {
            System.out.println("Good job");
        }
        else
        {
            System.out.println("Wrong answer.");
        }
    }
}