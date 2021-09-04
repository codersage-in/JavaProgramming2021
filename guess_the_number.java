import java.util.Random;
import java.util.*;
public class guess_the_number {
    public static void main(String[] args) {
        Random rn=new Random();
        Scanner sc=new Scanner(System.in);
        int rand_number=rn.nextInt(1000000)+1;
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int user=sc.nextInt();
            if(user==rand_number){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
