package 백준알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_25304 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int totalPrice = Integer.parseInt(br.readLine());
		int putInt = Integer.parseInt(br.readLine());

		
		for(int i = 0; i < putInt; i ++) {
			st = new StringTokenizer(br.readLine());
		
			totalPrice = totalPrice - Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			
		}
		if(totalPrice != 0 ) {
			System.out.println("NO");
		}
		else
			System.out.println("YES");

	}

}
