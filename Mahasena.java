import java.util.Scanner;
public class Mahasena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        int ready=0;
        int not_ready=0;
        for(int i=0;i<count;i++){
            int a=sc.nextInt();
            if(a%2==0){
                ready++;
            }
            else{
                not_ready++;
            }
        }
        if(ready>not_ready){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
    }
}
