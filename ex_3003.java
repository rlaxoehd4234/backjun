package 백준알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_3003 {

	public static void main(String[] args) throws IOException {
	
		
		int[] array2 = new int[6];
		int[] array = new int[6];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		StringTokenizer st;
		
		array[0] = 1;
		array[1] = 1;
		array[2] = 2;
		array[3] = 2;
		array[4] = 2;
		array[5] = 8;
		
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < array.length; i ++)
		{
		array2[i] = Integer.parseInt(st.nextToken());	
		
		}
		for(int i = 0 ; i < array.length; i ++) {
			array[i] = array[i] - array2[i];
		}
		
		for(int i = 0; i < array.length; i ++) {
			System.out.print(array[i] + " ");
		}
		
		
		
		
		
	
	}

}
