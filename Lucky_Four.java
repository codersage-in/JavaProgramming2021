import java.util.*;

class Lucky_Four{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int f,g,h=0;
        int i;
        for(i = 1; i<=num; i++){
            f= scan.nextInt();
            while(f!=0){
                g=f%10;
                if(g%4==0){
                    h++;
                }
                f -= g;
            }
            System.out.println(h);
        }
    }
}