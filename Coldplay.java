import java.util.*;

public class Coldplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int a,b,c;
        for(int i=0;i<count;i++){
            a= sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("The man can listen the song "+c+" times");
        }
    }
}
