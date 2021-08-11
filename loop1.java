import java.util.*;
public class loop1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        //scan.nextLine();
        for(int i=1;i<=10;i++)
        {
            System.out.println(N + " x " + +i + " = " + N*i);
        }
        input.close();
    }  
}
