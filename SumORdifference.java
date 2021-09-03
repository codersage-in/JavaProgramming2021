import java.util.*;
import java.lang.*;


    /* Name of the class has to be "Main" only if the class is public. */
    class SumORdifference
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner input = new Scanner(System.in);

            int N1 = input.nextInt();
            int N2 = input.nextInt();

            int result = 0;
            if(N1 > N2){
                result = N1 - N2;
                System.out.println(result);
            }
            else{
                result = N1 + N2;
                System.out.println(result);
            }
        }
    }

