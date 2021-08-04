import java.util.*;

class AMSTRONG {
    public static void main(System[] args) {
        int n;
        boolean ans;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the max limit:");
        n=input.nextInt();
        System.out.println("the amstrong number till the given limit is:");
        for(int i=0;i<=n;i++){
            ans=isAmstrong(n);
        }
        input.close();
    }
    
    static boolean isAmstrong(int x){

        int temp;
        int m, digit=0;
        int sum=0;
        temp=x;
        while(temp>0){
        
            temp=temp/10;
            digit++;
        }
        temp=x;
        while(temp>0){
            m=temp%10;
        
        sum=sum+((int)Math.pow(m,digit));

        temp=temp/10;
        }
        if(x==sum){
            
            System.out.println(x+" ");
            return true;
        }
        else return false;
    }

    
}
