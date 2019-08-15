package exercises;

import java.util.Locale;
import java.util.Scanner;

public class IniciaisPT3While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 01) Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		System.out.print("Forneca uma senha de 04 digitos: ");
		int x = sc.nextInt();

		while (x != 2019) {
			System.out.println("Senha Incorreta!");
			System.out.print("Forneca uma senha valida: ");
			x = sc.nextInt();
		}
		System.out.println("Acesso liberado!");

		// ----------------------------------------------------------------------------------------//

		/*
		 * 02) Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */

		System.out.print("Digite as cordenadas X e Y: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		while (x1 != 0 && y1 != 0) {
			if (x1 > 0 && y1 > 0) {
				System.out.println("Q1");
			} else if (x1 > 0 && y1 < 0) {
				System.out.println("Q4");
			} else if (x1 < 0 && y1 > 0) {
				System.out.println("Q2");
			} else {
				System.out.println("Q3");
			}
			System.out.print("Digite novamente: ");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
		}

		// -----------------------------------------------------------------------------------------//

		/*
		 * 03) Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		int code, Alcool = 0, Gasolina = 0, Diesel = 0;
		int opcao = 0;
		code = menu(opcao);

		while (code != 4) {

			if (code < 1 || code > 4) {

				System.out.println("Codigo Invalido!");
				code = menu(opcao);

			} else if (code == 1) {

				Alcool++;
				code = menu(opcao);

			} else if (code == 2) {

				Gasolina++;
				code = menu(opcao);

			} else {

				Diesel++;
				code = menu(opcao);
			}
		}

		result(Alcool, Gasolina, Diesel);

		sc.close();
	}

	public static int menu(int x) {

		Scanner sx = new Scanner(System.in);

		System.out.println("Escolha uma das opcoes: ");
		System.out.println("[1] - Alcool");
		System.out.println("[2] - Gasolina");
		System.out.println("[3] - Diesel");
		System.out.println("[4] - Fim");
		System.out.print("-> ");
		int value = sx.nextInt();
		return value;

	}

	public static void result(int a, int b, int c) {

		System.out.println("Muito Obrigado!");
		System.out.println("Alcool = " + a);
		System.out.println("Gasolina = " + b);
		System.out.println("Diesel = " + c);

	}

}
