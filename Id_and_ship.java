package Code_chef;
 import java.util.*;
import java.lang.*;
import java.io.*;
class  Id_and_ship 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner input =new Scanner(System.in);
		 int t=input.nextInt();
        char a;
        while(t-- >0)
        {
            a=input.next().charAt(0);
            if(a=='B' || a=='b')
                System.out.println("BattleShip");
            else if(a=='C' || a=='c')
                System.out.println("Cruiser");
            else if (a=='D' || a=='d')
                System.out.println("Destroyer");
            else if(a=='F' || a=='f')
                System.out.println("Frigate");
        }
   
	}
}
