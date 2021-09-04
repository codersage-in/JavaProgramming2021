import java.util.Scanner;
public class Helping_Chef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        for(int i=0;i<count;i++){
            int a=sc.nextInt();
            if(a<10){
                System.out.println("Thanks for helping Chef!");
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
