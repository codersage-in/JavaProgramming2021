import java.util.Scanner;
public class helping_chef {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++){
            int n = scan.nextInt();
            if(n < 10){
                System.out.println("Thanks for helping Chef!");
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
