import java.util.*;
import java.lang.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class Mahasena
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner(System.in);

            int N = in.nextInt();
            int cnt = 0;
            int mnt = 0;
            for(int i=0;i<N;i++){
                int num = in.nextInt();
                if(num%2 == 0){
                    cnt++;
                    //Lucky
                }
                else{
                    mnt++;
                    //Unlucky
                }
            }
            if(cnt > mnt){
                System.out.println("READY FOR BATTLE");
            }
            else{
                System.out.println("NOT READY");
            }
        }
    }

