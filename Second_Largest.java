//Method-1
import java.util.*;

public class Second_Largest {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}

//Method-2
/*
import java.util.Scanner;

public class Second_Largest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int []num = new int[N];
        if(N>=1 && N<=1000)
        {
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    num[j] = scan.nextInt();
                }
                //Arrays.sort(newnum);
                for (int j = 0; j < N; j++)
                {
                    if (num[j] >= 1 && num[j] <= 1000000)
                    {
                        for (int k = j + 1; k < N; k++)
                        {
                            if (num[j] < num[k])
                            {
                                int temp = num[j];
                                num[j] = num[k];
                                num[k] = temp;
                            }
                        }
                    }
                }
                System.out.println(num[1]);
            }
        }
    }
}*/