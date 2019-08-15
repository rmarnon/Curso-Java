package exercises;

import java.util.Locale;
import java.util.Scanner;

public class IniciaisPT4For {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 01) Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de
		 * 1 até X, um valor por linha, inclusive o X, se for o caso.
		 */
		
		int n = 0;
		
		do {
			System.out.println("Mostra impares!");
			System.out.print("Digite um numero: ");		
			n = sc.nextInt();
		} while (n < 1 || n > 1000);
		

		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		// ---------------------------------------------------------------------------------------//

		/*
		 * 02) Leia um valor inteiro N. Este valor será a quantidade de valores inteiros
		 * X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		System.out.print("Digite a quantidade numeros a verificar p/ intervalo [10-20]: ");
		int quantidade = sc.nextInt();
		int in = 0, out = 0;

		for (int cont = 1; cont <= quantidade; cont++) {
			System.out.print("Digite o " + cont + "# valor: ");
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println("In: " + in);
		System.out.println("Out: " + out);

		// ------------------------------------------------------------------------------------------//

		/*
		 * 03) Leia 1 valor inteiro N, que representa o número de casos de teste que vem
		 * a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com
		 * uma casa decimal. Apresente a média ponderada para cada um destes conjuntos
		 * de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso
		 * 3 e o terceiro valor tem peso 5.
		 */

		System.out.print("Digite a quantidade de testes: ");
		int testes = sc.nextInt();		
		double media;
		
		for (int cont = 1; cont <= testes; cont++) {
			System.out.print("valores sequencia " + cont + "# ");
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			
			media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;
			System.out.printf("%.1f %n", media);
			
		}
		
		//----------------------------------------------------------------------------------------//
		
		
		/* 04) Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão
		 * do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem 
		 * "divisao impossivel". 
		 */
		
		System.out.println("Quantos testes quer fazer? ");
		double test = sc.nextDouble();
				
		for (int cont = 1; cont <= test; cont++) {
			System.out.print("Digite o primeiro valor: ");
			double val1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double val2 = sc.nextDouble();
			
			if (val2 == 0) {
				System.out.println("Divisao impossivel!");
			}
			else {
				double result = val1 / val2;
				System.out.println("Resultado = " + result);
			}
			
		}
		
		//----------------------------------------------------------------------------------------//
		
		/* 05) Ler um valor N. Calcular e escrever seu respectivo fatorial. 
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial 
		 * de 0 é 1. 
		 */
 
		System.out.print("Digite um numero p/ Fatorial: ");
		int num = sc.nextInt();
		
		int fat = 1;

		for (int cont = 1; cont <= num; cont++) {

			fat = fat * cont;

		}	

		System.out.println(fat);
		
		//----------------------------------------------------------------------------------------//
		
		/* 06) Ler um número inteiro N e calcular todos os seus divisores.
		 */
		
		System.out.print("Procurar divisores -> ");
		int nd = sc.nextInt();				;
		
		for (int cont = 1; cont <= nd; cont++) {
			if (nd % cont == 0) {
				System.out.println(cont);
			}
		}
		
		//-----------------------------------------------------------------------------------------//
		
		/* 07) Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar 
		 * na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois 
		 * o quadrado e o cubo do valor, conforme exemplo. 
		 */
 
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			int q = i * i;
			int c = i * i * i;
			System.out.printf("Numero #%d, Quadrado = %d, Cubo = %d %n", i, q, c);
		}
		
		/* Fixacao: 
		 * Ler um numero, se nao positivo, repetira a mensagem ate digitar positivo, perguntar quantos
		 * numeros serao lidos, em seguida mostrar o maior deles.
		 */
		int N, maior = 0;
		do {
			System.out.print("Digite a quantidade de numeros para verificar o maior: ");
			N = sc.nextInt();
		} while (N <= 0);
		
		for (int cont = 1; cont <= N; cont++) {
			System.out.print("Digite o " + cont + "# valor: ");
			int valor = sc.nextInt();
			
			if (valor > maior) {
				maior = valor;
			}
			
		}
		
		System.out.println("O maior valor eh: " + maior);
		
		sc.close();
	}

}
