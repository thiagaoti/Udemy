package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//double xA,xB,xC,yA,yB,yC;
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		
		System.out.println("Entre com os medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double ax = x.area();
		
		double ay = y.area();
		
		System.out.printf("A area do triangulo X: %.4f%n", ax);
		System.out.printf("A area do triangulo Y: %.4f%n", ay);
		
		if ( ax > ay) {
			System.out.println("A maior area é a X");
		} else {
			System.out.println("A maior area é a Y");
		}
		
		
		sc.close();	
    }

}
