import java.util.*;
public class Javastatics {
    public static void main(String args[])
    {
        Scanner S= new Scanner(System.in);
        int B,H;
        B=S.nextInt();
        H=S.nextInt();
        if(B>0 && H>0)
        {
            System.out.println("Area of Parallelogram="+B*H);
        }
        else{
            System.out.println("java.lang.Exception:Breadth and Height must be positive");
        }
    }
}
