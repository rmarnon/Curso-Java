package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digit two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
				
		int higher = max(a, b); //Funcao 01 Metodo Max
		
		showResult(higher); //Funcao 02 Metodo showResult
		
		sc.close();
	}
	
	/*
	 * Todas as funcoes devem ser declaradas dentro de uma classe
	 */
	
	public static int max (int x, int y) { //Funcao 01 retorna inteiro c/ 02 parametros
		
		return (x > y) ? x : y; //Condicao ternaria
				
	}
	
	public static void showResult (int valor) { //Funcao 02 nao tem retorno e tem somente 01 parametro
		
		System.out.println("Higher = " + valor);
	}

}