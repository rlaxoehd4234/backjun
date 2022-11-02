package 백준알고리즘;

import java.io.*;
import java.util.*;

public class ex_2563 {

	public static void main(String[] args) throws IOException{

		boolean[][]Matrix = new boolean[100][100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int putNum = Integer.parseInt(br.readLine());
		int firstNum;
		int secondNum;
		int result = 0;
		
		for(int i = 0; i < putNum; i++) {
			st = new StringTokenizer(br.readLine());
			firstNum = Integer.parseInt(st.nextToken());
			secondNum = Integer.parseInt(st.nextToken());
			for(int j = 0; j < 10; j++) {
				for(int k =0; k < 10; k ++) {
					Matrix[firstNum+j][secondNum] = true;
					Matrix[firstNum+j][secondNum+k] = true; 
					
				}
			}
		}

		for(int i = 0; i <100; i ++) {
			for(int j = 0; j <100; j++) {
				if(Matrix[i][j] == true) result++;
			}
		}
		System.out.println(result);
}
}
