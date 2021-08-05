import java.util.Scanner;
public class ChefAndOperators {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt() ;
            int b=in.nextInt();
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
