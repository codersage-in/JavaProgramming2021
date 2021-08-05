import java.util.*;
//import java.lang.*;
//import java.io.*;
//import java.math.*;

class SquareRoot {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < t; i++)
        {
            double a = scanner.nextInt();
            double ans = Math.sqrt(a);

            System.out.println(ans);
        }

        scanner.close();
    }
    
}
