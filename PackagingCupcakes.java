//Explain Scanner class for taking input
//Explain for loop
//Explain  division (/) operator


import java.util.Scanner;

class PackagingCupcakes
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// Get the total nos
		int t =input.nextInt();

		for(int i =0;i<t;i++){
		    int a  = input.nextInt();
		    System.out.println((a/2)+1);
		}

	}
}
