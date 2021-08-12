import java.util.*;
public class Turbo_Sort{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<t;i++)
		{
		   arr[i]=s.nextInt(); 
        }
        Arrays.sort(arr);
        for(int i=0;i<t;i++)
		{
            System.out.println(arr[i]); 
        }
		
    }
    }