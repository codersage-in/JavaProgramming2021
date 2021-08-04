import java.util.*;
public class reverse{
    public static void main(String args[]){
        int num, rev=0;
        Scanner input= new Scanner(System.in);
        num=input.nextInt();
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of this number:"+rev);
        input.close();
    }
}