package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat  = new int[n][n];
		
		for(int i = 0 ;i < mat.length;i++) {
			for(int j = 0 ;j < mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal");
		for(int i = 0 ;i < mat.length;i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		int count = 0;
		for(int i = 0 ;i < mat.length;i++) {
			for(int j = 0 ;j < mat[i].length;j++) {
				if (mat[i][j] < 0 ) {
					count++;
				}
				
			}
		}
		System.out.println("Numeros Negativos:" + count);
		sc.close();
	}

}
