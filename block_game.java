import java.util.*;
public class block_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,number;
        t=sc.nextInt();
        if(t>=1 && t<=20){
            for(int i=0;i<t;i++){
                number=sc.nextInt();
                int numcopy=number,rev=0;
                while(number>0){
                    rev=rev*10 +(number%10);
                    number=number/10;
                }
                if(numcopy==rev){
                    System.out.println("wins");
                }
                else{
                    System.out.println("loses");
                }
            }
        }
    }
}
