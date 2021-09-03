import java.util.*;
import java.lang.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class valid_triangles
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scan = new Scanner(System.in);

            int N = scan.nextInt();
            for(int i=0;i<N;i++){
                int A = scan.nextInt();
                int B = scan.nextInt();
                int C = scan.nextInt();

                if((A + B + C) == 180){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }

