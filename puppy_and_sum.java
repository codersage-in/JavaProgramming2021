import java.util.*;
public class puppy_and_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,d,number,sum=0;
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            d=sc.nextInt();
            number=sc.nextInt();
            while(d!=0){
                sum=0;
                for(int j=1;j<=number;j++){
                    sum+=j;
                }
                //System.out.println(sum);
                number=sum;;
                d--;
            }
            System.out.println(sum);
        }
    }
}
