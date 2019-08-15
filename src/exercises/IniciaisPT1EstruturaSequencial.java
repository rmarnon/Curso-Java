package exercises;

import java.util.Locale;
import java.util.Scanner;

public class IniciaisPT1EstruturaSequencial {

	public static void main(String[] args) {
		
		/*01) Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
		 * desses números com uma mensagem explicativa
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;		
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		System.out.println("O resultado da soma e' " + (n1 + n2));
		System.out.println(" ");
		
		//----------------------------------------------------------------------------------------//
		
		/*02) Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área 
		 * deste círculo com quatro casas decimais conforme exemplos. 
		 
 		Fórmula da área: area = π . raio2 
 		Considere o valor de π = 3.14159 
		 */
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("Area do circulo: %.4f %n", area);
		
		//----------------------------------------------------------------------------------------//
		
		/*03) Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo 
		 * a fórmula: DIFERENCA = (A * B - C * D). 
		 */
		
		int a, b, c, d, dif;
		System.out.println("Digite 4 valores: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		dif = ((a * b) - (c * d));
		System.out.printf("Diferenca: %d %n",  dif);
		
		//----------------------------------------------------------------------------------------//
		
		/*04) Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
		 *  e o salário do funcionário, com duas casas decimais. 
		 */
		
		System.out.println("Digite o numero do funcionario: ");
		int numero = sc.nextInt();
		System.out.println("Digite o total de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: ");
		double horaTrabalhada = sc.nextDouble();
		double salary = (int)horas * horaTrabalhada;
		
		System.out.printf("Number = %d %n", numero);
		System.out.printf("Salary = $ %.2f %n", salary);
		
		//----------------------------------------------------------------------------------------//
		
		/*05) Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário
		 * de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça
		 * 2. Calcule e mostre o valor a ser pago. 
		 */
		
		System.out.println("Digite o codigo da primeira peca: ");
		int peca1 = sc.nextInt();
		System.out.println("Digite o codigo da segunda peca: ");
		int peca2 = sc.nextInt();
		System.out.println("Quantidade de pecas 01: ");
		int qtde1 = sc.nextInt();
		System.out.println("Quantidade pecas 02: ");
		int qtde2 = sc.nextInt();
		System.out.println("Valor peca 01: ");
		double valor1 = sc.nextDouble();
		System.out.println("Valor peca 02: ");
		double valor2 = sc.nextDouble();
		double resultado = ((qtde1 * valor1) + (qtde2 * valor2));
		
		System.out.printf("Valor total a ser pago = $ %.2f %n", resultado);
				
		//----------------------------------------------------------------------------------------//
		
		/*06) Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
		 * A, B e C.
		 * Em seguida, calcule e mostre:  
		 * 	a) a área do triângulo retângulo que tem A por base e C por altura.  
		 * 	b) a área do círculo de raio C. (pi = 3.14159)  
		 * 	c) a área do trapézio que tem A e B por bases e C por altura.  
		 * 	d) a área do quadrado que tem lado B.  
		 * 	e) a área do retângulo que tem lados A e B. 
		 */
		
		System.out.println("Digite tres valores aleatorios: ");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
				
		double triangulo = (a1 * c1) / 2;
		double circulo = pi * c1 * c1;
		double trapezio = ((a1 + b1) / 2 * c1);
		double quadrado = b1 * b1;
		double retangulo = a1 * b1;
		
		System.out.printf("Triangulo: %.3f %n", triangulo);
		System.out.printf("Circulo: %.3f %n", circulo);
		System.out.printf("Trapezio: %.3f %n", trapezio);
		System.out.printf("Quadrado: %.3f %n", quadrado);
		System.out.printf("Retangulo: %.3f %n", retangulo);
		
		sc.close();
	}

}

 