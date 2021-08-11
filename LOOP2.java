import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner X = new Scanner(System.in);
        int t=X.nextInt();
        for(int i=0;i<t;i++){
            int a = X.nextInt();
            int b = X.nextInt();
            int n = X.nextInt();

            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
        }
        System.out.println();
        }
        X.close();
    }
}
