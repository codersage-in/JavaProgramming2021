import java.util.Scanner;

public class Decrement_OR_Increment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        if(count%4==0){
            count++;
        }
        else{
            count--;
        }
        System.out.println(count);
    }
}
