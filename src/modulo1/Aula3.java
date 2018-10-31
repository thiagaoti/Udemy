package modulo1;

import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva 3 numeros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (( a >= b) && (a >=c)) {
			System.out.println(a);
		} else if ( (b >= a) && (b >= c) ) {
			System.out.println(b);
		} else if ( (c>= a) && (c >= b)) {
			System.out.println(b);
		}
    sc.close();
	}

}
