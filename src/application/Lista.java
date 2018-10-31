package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("THIAGO");
		list.add("RICARDO");
		list.add("JEAN");
		list.add(1, "CESAR");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		//Excluido Pelo Caractere
		System.out.println("----------------------");
		list.removeIf(x -> x.charAt(0) == 'R');
		for (String x : list) {
			System.out.println(x);
		}
		//Procurando Index
		System.out.println("----------------------");
		System.out.println("Index of THIAGO: " + list.indexOf("THIAGO"));
		//Filtro
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		// Filtro primeiro registro encontrado
		System.out.println("----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
		

	}

}
