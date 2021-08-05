import java.util.*;
//import java.lang.*;
//import java.io.*;

class SecondLargest{

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) 
        {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
        
            if(n1>n2 & n1>n3)
            {
                if(n2>n3)
                {
                    System.out.println(n2);
                }
                else
                {
                    System.out.println(n3);
                }
            }

            if(n2>n1 & n2>n3)
            {
                if(n1>n3)
                {
                    System.out.println(n1);
                }
                else
                {
                    System.out.println(n3);
                }
            }

            if(n3>n1 & n3>n2)
            {
                if(n1>n2)
                {
                    System.out.println(n1);
                }
                else
                {
                    System.out.println(n2);
                }
            }
        }
        scanner.close();
    }
}
