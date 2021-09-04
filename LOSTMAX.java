import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		sc.nextLine();
		while(k>0){
		    ArrayList<Integer> arr=new ArrayList<>();
		    String str=sc.nextLine();
		    Scanner sc1=new Scanner(str);
		    while(sc1.hasNextInt()){
		        arr.add(sc1.nextInt());
		    }
		    arr.remove(new Integer(arr.size()-1));
		    Collections.sort(arr);
		    System.out.println(arr.get(arr.size()-1));
		    k--;
		}
	}
}
