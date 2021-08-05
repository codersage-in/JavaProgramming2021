import java.util.Scanner;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,X,Y,Z;
        n=sc.nextInt();
        if(n>=1 && n<=1000){
            for(int i=0;i<n;i++){
                X=sc.nextInt();
                Y=sc.nextInt();
                Z=sc.nextInt();
                if(X>=1 && Y>=1 && Z>=1 && X<=10000 && Y<=10000 && Z<=10000)
                {
                    if(X>Y && X<Z){
                        System.out.println(X);
                    }
                    else if(X>Z && Z<Y){
                        System.out.println(X);
                    }
                    else if(Y>X && Y<Z){
                        System.out.println(Y);
                    }
                    else if(Y>Z && Y<X){
                        System.out.println(Y);
                    }
                    else if(Z>X && Z<Y){
                        System.out.println(Z);
                    }
                    else{
                        System.out.println(Z);
                        sc.close();
                    }
                }
            }
        }
    }
}