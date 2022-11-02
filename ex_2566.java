package 백준알고리즘;

import java.io.*;
import java.util.*;

public class ex_2566 {

	public static void main(String[] args) throws IOException {
		
		int[][] Matrix = new int[9][9];
		int maxNum = 0;
		int xPlace = 0;
		int yPlace = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<9; j++) {
				Matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j<9; j++) {
				if(Matrix[i][j] > maxNum) {
					maxNum = Matrix[i][j];
					xPlace = i+1;
					yPlace = j+1;
				}
				  
			}
		
		}
		System.out.println(maxNum);
		System.out.println(xPlace+" "+yPlace);


	}

}
