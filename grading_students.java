import java.util.*;
public class grading_students 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result[]=new int[n];
        int marks;
        for(int i=0;i<n;i++)
        {
            marks=sc.nextInt();
            if (marks < 38) 
            {
                result[i] = marks;
            } 
            else 
            {
                int f1 = marks + 1;
                int f2 = marks + 2;
                if (f1 % 5 == 0) 
                {
                    result[i] = f1;
                } 
                else if (f2 % 5 == 0) 
                {
                    result[i] = f2;
                } 
                else 
                {
                    result[i] = marks;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(result[i]);
        }
        sc.close();
    }   
}
