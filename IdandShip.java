import java.util.*;
import java.lang.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class IdandShip
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            for(int i=0;i<N;i++){
                String alphbet = sc.next();

                if(alphbet.equalsIgnoreCase("b")){
                    System.out.println("BattleShip");
                }
                if(alphbet.equalsIgnoreCase("c")){
                    System.out.println("Cruiser");
                }
                if(alphbet.equalsIgnoreCase("d")){
                    System.out.println("Destroyer");
                }
                if(alphbet.equalsIgnoreCase("f")){
                    System.out.println("Frigate");
                }
            }
        }
    }

