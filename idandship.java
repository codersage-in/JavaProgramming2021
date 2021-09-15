import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here
Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
for(int i = 1; i<=T ; i++)
{
   char ID = sc.next().charAt(0);
   if((ID=='B')|| (ID=='b'))
   {
       System.out.println("BattleShip");
   }
   else if((ID=='C')|| (ID=='c'))
   {
       System.out.println("Cruiser");
   }
   else if((ID=='D')|| (ID=='d'))
   {
       System.out.println("Destroyer");
   }
   else{
       System.out.println("Frigate");
   }
}
}
}