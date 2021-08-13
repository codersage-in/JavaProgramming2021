import java.util.Scanner;

public class IdAndShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String  S = sc.next();
            if(S.equals("B")|| S.equals("b")){
                System.out.println("BattleShip");
            }else if(S.equals("C")||S.equals("c")){
                System.out.println("Cruiser");
            }else if(S.equals("D")|| S.equals("d")){
                System.out.println("Destroyer");
            }else if(S.equals("F")|| S.equals("f")){
                System.out.println("Frigate");
            }
        }
    }
}
