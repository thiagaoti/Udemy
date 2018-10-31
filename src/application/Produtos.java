package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoE;

public class Produtos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o produto:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Preço:");
		double preco = sc.nextDouble();
		System.out.print("Qtd:");
		int qtd = sc.nextInt();
		
		ProdutoE produto = new ProdutoE(name,preco,qtd);
		
		
		System.out.println("Dados do Produtos " + produto.toString());

		System.out.println();
		System.out.print("Entre com a Qtd de produto a ser add:");
		qtd = sc.nextInt();
		produto.addEstoque(qtd);

		System.out.println("Dados atualizados Produtos" + produto.toString());

		System.out.println();
		System.out.print("Entre com a Qtd de produto a ser removido:");
		qtd = sc.nextInt();
		produto.removeEstoque(qtd);

		System.out.println("Dados atualizados Produtos" + produto.toString());

		sc.close();

	}

}
