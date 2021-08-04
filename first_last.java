import java.util.*;

public class first_last{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int number;
        for(int i=0;i<num;i++){
            int cnt=0,sum=0;
            number=sc.nextInt();
            int numbercopy=number;
            int last=number%10;
            while(number>0){
                int r=number%10;
                cnt++;
                number=number/10;
            }
            int first=(int)(numbercopy/Math.pow(10,cnt-1));
            sum=sum+first+last;
            System.out.println(sum);
        }
    }

}
