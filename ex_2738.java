package 백준알고리즘;

import java.io.*;
import java.util.*;

public class ex_2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int firstNum = Integer.parseInt(st.nextToken());
		int secondNum = Integer.parseInt(st.nextToken());
		
		int[][]array = new int[firstNum][secondNum];
		
	
		for(int i = 0; i<firstNum; i ++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < secondNum; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i<firstNum; i ++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < secondNum; j++) {
				array[i][j]+=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i<firstNum; i ++) {
			for(int j = 0; j < secondNum; j++) {
				System.out.print(array[i][j]+" ");
			
			}
			System.out.println();
		}
		
		
		

	}

}
