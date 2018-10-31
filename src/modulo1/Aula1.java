package modulo1;

import java.util.Locale;

public class Aula1 {

	public static void main(String[] args) {
		String prod1 = "Computador";
		String prod2 = "Office desk";
		
		int age = 30;
		int code =  5290;
		char gender =  'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Produtos > %s / %s %n",prod1,prod2);
		System.out.printf("%s , tem o valor de $ %.2f %n",prod1,preco1);
		System.out.printf("%s , tem o valor de $ %.2f %n",prod2,preco2);
		
		System.out.printf("Record: %d years old , code %d and gender %s %n",age,code,gender);
		
		System.out.printf("Measure com 8 casas decimais: %.8f %n",measure);
		
		System.out.printf("Rouded (3 casas decimais: %.3f %n",measure);
		
		Locale.setDefault(Locale.ENGLISH);
		
		System.out.printf("US (3 casas decimais: %.3f %n",measure);
		
	}

}
