package modulo1;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Aula4 {

	public static void main(String[] args) {
		String or = "abcde FGHIJ ABC abc DEFG   ";
		
		String s1 = or.toLowerCase();
		String s2 = or.toUpperCase();
		String s3 = or.trim();
		String s4 = or.substring(2);
		String s5 = or.substring(2,9);
		String s6 = or.replace("a", "X");
		int s7 = or.indexOf("bc");
		int s8 = or.lastIndexOf("bc");
		
		
		
		System.out.println(or);
		System.out.println(" Todas minusculas ");
		System.out.println(s1);
		System.out.println("*********************************");
		System.out.println(" Todas maiusculas  ");
		System.out.println(s2);
		System.out.println("*********************************");
		System.out.println(" Sem Espaços  ");
		System.out.println(s3);
		System.out.println("*********************************");
		System.out.println(" Pegando o caracter posição 2 em diante");
		System.out.println(s4);
		System.out.println("*********************************");
		System.out.println(" Pegando o caracter posição 2 ate a 9");
		System.out.println(s5);
		System.out.println("*********************************");
		System.out.println(" Trocando a por X");
		System.out.println(s6);
		System.out.println("*********************************");
		System.out.println(" Qual posicao tem os carater");
		System.out.println(s7);
		System.out.println("*********************************");
		System.out.println(" Qual posicao do ultimo que tenha os carater");
		System.out.println(s8);
		System.out.println("*********************************");
		
		String s = "Batata Maça Limao";
		
		String[] vetor  = s.split(" ");
		String a = vetor[0];
		String b = vetor[1];
		String c = vetor[2];
		System.out.println("Split");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("*********************************");

		

	}

}
