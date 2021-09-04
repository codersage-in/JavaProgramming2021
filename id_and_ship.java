import java.util.*;
public class id_and_ship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        String c;
        t=sc.nextInt();
        if(t>=1 && t<=20){
            for(int i=0;i<t;i++){
                c=sc.next();
                if(c.compareTo("b")==0||c.compareTo("B")==0){
                    System.out.println("BattleShip");
                }
                else if(c.compareTo("c")==0||c.compareTo("C")==0){
                    System.out.println("Cruiser");
                }
                else if(c.compareTo("d")==0||c.compareTo("D")==0){
                    System.out.println("Destroyer");
                }
                else if(c.compareTo("f")==0||c.compareTo("F")==0){
                    System.out.println("Frigate");
                }
            }
        }
    }
}
