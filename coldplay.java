import java.util.*;
public class coldplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,M,S;
        T=sc.nextInt();
        for(int i=0;i<T;T++){
            M=sc.nextInt();
            S=sc.nextInt();
            if(M>=1 && M<=100 && S>=1 && S<=10){
            System.out.println(M/S);
            }
        }
    }    
}
