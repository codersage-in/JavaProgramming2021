import java.util.*;
import java.lang.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class Primality_Test
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scan = new Scanner(System.in);

            int N = scan.nextInt();
            for(int i=0;i<N;i++){
                long num = scan.nextLong();
                int cnt = 0;
                for(int j=2;j<num/2;j++){
                    if(num%j == 0){
                        System.out.println("no");
                        cnt = 1;
                        break;
                    }
                }

                if(num == 1){
                    System.out.println("no");
                }
                if(cnt ==0 && num != 1){
                    System.out.println("yes");
                }
            }
        }
    }

