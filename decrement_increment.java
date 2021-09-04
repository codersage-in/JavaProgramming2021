import java.util.*;
public class decrement_increment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        number=sc.nextInt();
        if(number%4==0){
            System.out.println(number+1);
        }
        else{
            System.out.println(number-1);
        }
    }    
}
