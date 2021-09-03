import java.util.*;
import java.lang.*;

    class DecrementORincrement
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();
            if(number%4 == 0){
                number++;
                System.out.println(number);
            }
            else{
                number--;
                System.out.println(number);
            }
        }
    }

