package modulo1;

import java.util.Locale;
import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//System.out.print("Entre com um nome:");
		//String name = sc.next();
				
		//System.out.print("Quantos banheiros tem na sua casa:");
		//int b = sc.nextInt();
				
		//System.out.print("Media de Salario:");
		//double s = sc.nextDouble();
		
		
		//System.out.print("Entre com o Nome, Idade e Altura");
		//String name2 = sc.next();
		//int idade = sc.nextInt();
		//double altura = sc.nextDouble();
		
		//System.out.printf("%n Voce digitou: %s",name);
		//System.out.printf("%n Voce tem: %d banheiro(s)",b);
		//System.out.printf("%n Sua media salarial é de %.2f",s);
		//System.out.printf("%n -----------------------------");
		//System.out.printf("%n Nome: %s %n Idade: %d %n Altura: %.2f",name2,idade,altura);
		System.out.printf("%n--- Exercicio 1 ---%n");
		
		System.out.print("Digite valor 1:");
		int n1 = sc.nextInt();
		System.out.print("Digite valor 2:");
		int n2 = sc.nextInt();
		int n3 = n1+n2;
		System.out.printf("Soma: %d",n3);
		System.out.printf("%n---- Exercicio 2 ----%n");
		System.out.print("Digite raio:");
		double r = sc.nextDouble();
		double result = Math.PI * r * r;
		System.out.printf("A: %.4f",result);
		System.out.printf("%n---- Exercicio 3 -----%n");
		System.out.print("Digite valor 1:");
		int A = sc.nextInt();
		System.out.print("Digite valor 2:");
		int B = sc.nextInt();
		System.out.print("Digite valor 4:");
		int C = sc.nextInt();
		System.out.print("Digite valor 5:");
		int D = sc.nextInt();
		result = (A * B - C * D);
		
		System.out.printf("Resultado: %.1f",result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        				
		
		
		
		sc.close();
		

	}

}
