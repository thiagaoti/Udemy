package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite valores de linha x coluna da matriz:");
		System.out.println("Linha: ");
		int n = sc.nextInt();
		System.out.println("Coluna: ");
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		System.out.println("Digite a sua matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite numero para pesquisa:");
		int p = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == p) {
					System.out.println("Posição: [" + i + "],[" + j+"]" );
					
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima:  " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita:  " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo:  " + mat[i + 1][j]);
					}
					System.out.println("--------------------------------");
				}

			}
		}

		sc.close();
	}

}
