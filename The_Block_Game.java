import java.util.*;
import java.lang.*;


    /* Name of the class has to be "Main" only if the class is public. */
    class The_Block_Game
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            for(int i=0;i<N;i++){
                int number = sc.nextInt();
                int newnumber = number;

                int palin = 0;

                while(newnumber!=0){
                    int modul = newnumber%10;
                    palin = palin*10 + modul;
                    newnumber = newnumber/10;
                }
                if(palin == number){
                    System.out.println("wins");
                }
                else{
                    System.out.println("loses");
                }
            }
        }
    }

