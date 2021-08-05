import java.util.Scanner;
public class Helpingchef {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            if(n < 10){
                System.out.println("Thanks for helping Chef!");
            }
            else{
                System.out.println(-1);
            }
        }
    }    
}
