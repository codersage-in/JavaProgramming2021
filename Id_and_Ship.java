import java.util.Scanner;

public class Id_and_Ship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            String a=sc.next();
            if(a.compareTo("B")==0||a.compareTo("b")==0){
                System.out.println("BattleShip");
            }
            else if(a.compareTo("C")==0||a.compareTo("c")==0){
                System.out.println("Cruiser");
            }
            else if(a.compareTo("D")==0||a.compareTo("d")==0){
                System.out.println("Destroyer");
            }
            else if(a.compareTo("F")==0||a.compareTo("f")==0){
                System.out.println("Frigate");
            }
            else{}
        }
    }
}
