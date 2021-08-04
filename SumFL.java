public class SumFL {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
        for(int i=1;i<=n;i++)
    {
        int x=s.nextInt();
        int sum=(x%10);
        int temp=0;
        while(x>0){
            temp=x%10;
            x/=10;
        }
        sum+=temp;
        System.out.println(sum);
    }
}
