package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class RhList {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Salario> list = new ArrayList<>();
		
		System.out.println("Quanto Funcionario deseja Cadastrar?: ");
		int n =  sc.nextInt();
		
		for (int i=0; i < n;i++) {
			System.out.println("Funcionario #"+(i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salario: ");
			double salary = sc.nextDouble();
			
			list.add(new Salario(id, name, salary));
			
		}
		
		System.out.println("Qual funcionario deseja aumentar o salario: ");
		int i = sc.nextInt();
		Salario result = list.stream().filter(x -> x.getId() == i).findFirst().orElse(null);
		
		if (result == null) {
			System.out.println("Nao Encontrado");
		} else {
			System.out.println("Entre com o Percentual: ");
			double p = sc.nextDouble();
			
			result.addSalary(p);
			
		}
		System.out.println("Funcionarios");
		
		for (Salario s: list) {
			System.out.println(s);
		}
			
		sc.close();
	}

}
