package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoE;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		//double[] vect = new double[n];
		double sum = 0.0;
		ProdutoE[] vect = new ProdutoE[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new ProdutoE(nome, preco); 
			
			sum += vect[i].getPreco();
		}
		
		double med = sum/vect.length;
		
		System.out.printf("%.2f%n",med);

		sc.close();
	}

}
