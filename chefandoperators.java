import java.util.*;
import java.lang.*;


    class Chefandoperators
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scan = new Scanner(System.in);

            int N = scan.nextInt();
            for(int i=0;i<N;i++){
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();

                if(num1 < num2){
                    System.out.println("<");
                }
                else if(num1 > num2){
                    System.out.println(">");
                }
                else{
                    System.out.println("=");
                }
            }
        }
    }

