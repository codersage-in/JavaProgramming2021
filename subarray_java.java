import java.util.*;
public class subarray_java
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        int count=0;
        int N = S.nextInt();
        int[] array = new int[N];
        for(int i=0;i<N;i++){
            array[i]=S.nextInt();
        }

        for(int j=0;j<N;j++)
        {
            int sum=0;
            for(int k=j;k<N;k++)
            {
                sum=array[k]+sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


   