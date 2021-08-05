import java.util.Scanner;
public class chef_operator {
    public static void main(String arg[]){
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++){
            int a = scan.nextInt() , b=scan.nextInt();
            if(a < b){
                System.out.println("<");
            }
            else if(a > b){
                System.out.println(">");
            }
            else{
                System.out.println("=");
            }
        }
    }
}
