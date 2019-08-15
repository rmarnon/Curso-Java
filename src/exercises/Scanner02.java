package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt(); //next anterior
		sc.nextLine(); //Usar sempre que for fazer um nextLine() apos qualquer next() p/ limpar memoria
		String nome = sc.nextLine(); //nextLine dando (Flush) na linha de cima -> Garbage colector
		char gender = sc.next().charAt(0); //next retorna String
		String s = sc.next(); //Le a String B5
		char letter = s.charAt(0); //Pega o caracter B na posicao "0".
		int digit = Integer.parseInt(s.substring(1));//Recorta a string, pegando a posicao 1 "5".
		double n2 = sc.nextDouble();
		String nome2 = sc.next(); // Next le nome ate quebra da linha
		char gender2 = sc.next().charAt(0);// Sexo
		int age = sc.nextInt(); //Idade inteiro
		double height = sc.nextDouble();// Altura double
		
		System.out.println(idade);
		System.out.println(nome);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(nome2);
		System.out.println(gender2);
		System.out.println(age);
		System.out.println(height);		
		sc.close();
	}

}