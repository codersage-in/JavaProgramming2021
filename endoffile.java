import java.util.*;
public class endoffile
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine())
        {
            System.out.println(++i + " " + sc.nextLine());
        }
        sc.close();
    }
}
