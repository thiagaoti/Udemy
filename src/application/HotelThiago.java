package application;

import java.util.Scanner;

import entities.Quartos;

public class HotelThiago {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Quantos quartos voce deseja alugar?");
		int n = sc.nextInt();
						 
		Quartos[] vect = new Quartos[10];
		
		for(int i = 0 ; i < n;i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println("-----------------------");
			vect[quarto] = new Quartos(nome, email, quarto);
		}
		
		for(int i = 0 ; i < vect.length;i++) {
			
			if (vect[i] != null) {
			System.out.println(vect[i].toString());
			}
			
		}
		
		sc.close();

	}

}
