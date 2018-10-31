package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Operacoes;

public class NewBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Operacoes opr;

		System.out.println("-----------  NEW BANK -----------");
		System.out.println("---------------------------------");
		System.out.println("DEPOSITO    ---------------------");
		System.out.print("Entre com o numero da Conta:");
		int conta = sc.nextInt();
		System.out.print("Entre com o Nome:");
		String nome = sc.next();
		System.out.print("Deseja fazer um Deposito Inicial? (y/n)?");
		char resp = sc.next().charAt(0);

		if (resp == 'y') {

			System.out.print("Entre com o Valor do Deposito: R$ ");
			double saldoInicial = sc.nextDouble();
			opr = new Operacoes(nome, saldoInicial, conta);

		} else {
			opr = new Operacoes(nome, conta);
		}

		System.out.println("Extrato da Conta:" + opr.toString());

		System.out.print("Entre com um Deposito:");
		double deposito = sc.nextDouble();
		opr.deposito(deposito);

		System.out.println("Dados atualizados: " + opr.toString());

		System.out.print("Entre com um Saque:");
		double saque = sc.nextDouble();
		opr.saque(saque);

		System.out.println("Dados atualizados: " + opr.toString());

		sc.close();

	}

}
