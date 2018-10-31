package modulo1;

import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		String day;

		switch (x) {
		case 1:
			day = "Domingo";
			break;
		case 2:
			day = "Segunda-Feira";
			break;
		case 3:
			day = "Terça-Feira";
			break;
		case 4:
			day = "Quarta-Feira";
			break;

		default:
			day = "Valor Invalido";

		}

		System.out.println(day);
		sc.close();
	}

}
