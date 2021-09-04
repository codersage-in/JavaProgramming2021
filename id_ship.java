import java.util.*;
public class id_ship 
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        char entry;
        for(int i=0;i<T;i++)
        {
            entry=in.next().charAt(0);
            if(entry=='b' || entry=='B')
            {
                System.out.println("BattleShip");
            }
            if(entry=='c' || entry=='C')
            {
                System.out.println("Cruiser");
            }
            if(entry=='d' || entry=='D')
            {
                System.out.println("Destroyer");
            }
            if(entry=='f' || entry=='F')
            {
                System.out.println("Frigate");
            }
        }
        in.close();
    }
}
