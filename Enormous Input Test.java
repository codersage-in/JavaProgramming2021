import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if (x % k == 0) {
				ans=ans+1;
			}
		}
      System.out.println(ans);
	}
}

	
	
	
